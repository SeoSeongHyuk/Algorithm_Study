#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

long long d[10001][3]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.
long long num[10001];

long long dp(int n, int time) {

	if (n <= 0) // 만약 index가 1이 된 경우 그 때의 경우의 수 1을 리턴해준다.
		return 0;

	if (d[n][time] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n][time];

	if (time == 2)
		d[n][time] = dp(n-1,0);
	else
		d[n][time] = max(dp(n - 1, time+1) + num[n], dp(n - 1, 0));

	return d[n][time];

}

int main() {

	int n = 0;

	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> num[i];
	}

	cout << dp(n, 0) << endl;

	return 0;
}
