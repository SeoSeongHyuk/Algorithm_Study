#include <iostream>
#include <algorithm>

using namespace std;

long d[10000][10]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.

int dp(int n, int digit) {

	if (n == 1) // 만약 index가 1이 된 경우 그 때의 경우의 수 1을 리턴해준다.
		return 1;

	if (d[n][digit] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n][digit];

	for (int i = 0; i <= digit; i++)
		d[n][digit] = (dp(n - 1, i)+d[n][digit]) % 10007;

	return d[n][digit] % 10007;

}

int main() {

	int n = 0;

	cin >> n;

	long sum = 0;

	for (int i = 0; i <= 9; i++)
		sum += dp(n, i);

	sum = sum % 10007;

	cout << sum << endl;

	return 0;
}
