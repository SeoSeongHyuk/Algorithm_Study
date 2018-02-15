#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

long long d[100010][3]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.
long long num[3][100010];

long long dp(int n, int x) {

	if (n == 0) // 만약 index가 1이 된 경우 그 때의 경우의 수 1을 리턴해준다.
		return 0;

	if (d[n][x] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n][x];

	if (x == 0)
		d[n][x] = max(dp(n - 1, 1), dp(n - 1, 2));
	else if (x == 1)
		d[n][x] = max(dp(n - 1, 0), dp(n - 1, 2)) + num[1][n];
	else
		d[n][x] = max(dp(n - 1, 0), dp(n - 1, 1)) + num[2][n];

	return d[n][x];

}

int main() {

	int t,n = 0;

	cin >> t;

	while (t--) {

		cin >> n;

		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= n; j++) {
				cin >> num[i][j];
			}
		}

		for (int i = 1; i <= n; i++)
			for (int j = 0; j < 3; j++)
				d[i][j] = 0;

		long long ans = 0;
		for (int i = 0; i < 3; i++) {
			ans = max(ans, dp(n, i));
		}
		cout << ans << endl;
	}
	return 0;
}
