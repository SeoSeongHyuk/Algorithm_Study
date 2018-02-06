#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int d[1000001]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.
int p[1000001]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.

int dp(int n) {
	if (n < 0)
		return 0;

	if (n == 0) // 만약 모두 판매하였다면 return 0를 해주어 마무리한다.
		return 0;

	if (d[n] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n];
	
  // 점화식을 세워서 일반식을 구할 수 있었음.
  // n개 팔 때와 1개를 팔고 남은 개수를 팔 때를 max함수로 비교하며 최대값을 가진 함수가 d[n]에 대입되도록 하여 풀었다.
	for (int i = 1; i <= n; i++) { 
		d[n] = max(d[n], p[i]+dp(n-i));
	}
	return d[n];
}

int main() {

	int t = 0;

	cin >> t;

	for (int i = 1; i <= t; i++) {
		cin >> p[i];
	}

	cout << dp(t) << endl;

	return 0;
}
