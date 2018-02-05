#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int d[1000001]; // 배열 선언, 초기에 배열은 0으로 초기화 되어 있음.

int dp(int n) {
	if (n < 0) // 주어진 숫자가 0보다 작아지게 되는 경우이고 이는 성립되면 안되므로 return 0를 해준다.
		return 0;

	if (n == 0) // 만약 n이 0이 된 경우(해당 숫자값이 된 경우)그 때의 경우의 수 1을 리턴해준다.
		return 1;

	if (d[n] > 0) // 메모이제이션, DP에선 배열을 꼭 사용하고 메모이제이션은 항상 이와 같다.
		return d[n];

	d[n] = dp(n - 1) + dp(n - 2) + dp(n - 3); // 1로만 더하는 경우 + 2로만 더하는 경우 + 3으로만 더하는 경우를 d[n] 배열에 대입하고 이를 반환

	return d[n];
}

int main() {

	int ans,t = 0;

	cin >> t;

	while (t--) {

		cin >> ans;

		cout << dp(ans) << endl;

	}

	return 0;
}
