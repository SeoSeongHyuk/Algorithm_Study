#include <iostream>
#include <queue>
#include <Windows.h>
#define MAX 20001
using namespace std;

vector<int> graph[MAX];
vector<int> color(MAX, 0);

bool bfs(int n) {
	queue<int> q;
	q.push(n);
	color[n] = 1;

	while (!q.empty()) {
		int current = q.front();
		q.pop();

		for (int i = 0; i < graph[current].size(); i++) {
			int next = graph[current][i];

			if (color[next] == 0) {
				color[next] = ~color[current];
				q.push(next);
			}
			else {
				if (color[next] == color[current])
					return false;
			}
		}
	}
	return true;
}

int main() {

	int a, b, n, m, t;

	cin >> t;

	while (t--) {
    bool res = true;
		cin >> n >> m;

		for (int i = 1; i <= n; i++)
			graph[i].clear();
		color.assign(n + 1, 0);

		for (int i = 0; i < m; i++) {
			cin >> a >> b;

			graph[a].push_back(b);
			graph[b].push_back(a);
		}

		for (int i = 1; i <= n; i++) {
			if (color[i] == 0) {
				res &= bfs(i);
			}
		}
		if (res)
			cout << "YES" << endl;
		else
			cout << "NO" << endl;
		}

	return 0;
}
