#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

long long d[100001];
long long num[100001];

long long dp(int n) {

	if (n == 0)
		return 0;

	if (d[n] > 0)
		return d[n];

	for (int i = n - 1; i >= 0; i--) {
		if (num[n] > num[i])
			d[n] = max(d[n], dp(i)+num[n]);
	}

	return d[n];
}

int main() {

	int n = 0;

	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> num[i];
	}

	long long ans = 0;
	for (int i = n; i >= 1; i--) {
		ans = max(ans, dp(i));
	}

	cout << ans << endl;

	return 0;
}
