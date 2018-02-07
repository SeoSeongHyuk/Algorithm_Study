#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

long d[100][100]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.
long MOD = 1000000000;

int dp(int n, int digit) {

	if (n == 1) // 만약 index가 1이 된 경우 그 때의 경우의 수 1을 리턴해준다.
		return 1;

	if (d[n][digit] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n][digit];

	if (digit == 0) // 현재 숫자가 0인 경우 다음의 경우는 숫자 1 한가지다
		d[n][digit] = dp(n - 1, 1) % MOD;
	else if (digit == 9) // 현재 숫자가 9인 경우 다음의 경우는 숫자 8 한가지다
		d[n][digit] = dp(n - 1, 8) % MOD;
	else // 현재 숫자가 0과 9를 제외한 경우 다음의 경우는 두 개가 나온다.
		d[n][digit] = dp(n - 1, digit - 1) % MOD + dp(n - 1, digit + 1) % MOD;
	
	return d[n][digit]%MOD;
  
}

int main() {

	int n = 0;

	cin >> n;

	long s = 0;

	for (int i = 1; i <= 9; i++)
		s += dp(n, i);

	s = s % MOD;

	cout << s << endl;

	return 0;
}
