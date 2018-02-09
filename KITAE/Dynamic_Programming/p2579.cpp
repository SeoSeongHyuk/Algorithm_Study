#include <iostream>
#include <algorithm>
#include <string>
#include <limits>    

using namespace std;

int d[300][300]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.
int num[300]; // 입력받을 숫자를 저장할 배열 선언.

int dp(int n, int time) {

	if (n == 2) {
		if (time == 1) {
			return num[2] + num[1];
		}
		else if (time == 2) {
			return num[2];
		}
	}

	if (n == 1)
		return num[1];

	if (n == 0)
		return 0;
	else if (n < 0)
		return std::numeric_limits<int>::min();

	if (d[n][time] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n][time];

	if (time == 2) 
		d[n][time] = dp(n - 2, 1) + num[n];
	else 
		d[n][time] = max(dp(n - 1, time + 1), dp(n - 2, 1)) + num[n];

	return d[n][time];

}

int main() {

	int n = 0;

	cin >> n;

	for (int i = 1; i <= n; i++)
		cin >> num[i];

	cout << dp(n,1) << endl;

	return 0;
}
