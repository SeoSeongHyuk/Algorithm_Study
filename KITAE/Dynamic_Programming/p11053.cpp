#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

long long d[100001];
long long num[100001];

long long dp(int n) {

	if (d[n] > 0)
		return d[n];
	
	// for (int i = n-1; i >= 0; i--) { 으로 해도 된다.
	for (int i = n-1; i > 0; i--) {
		if (num[n] > num[i])
			d[n] = max(d[n], dp(i)+1);
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
		// ans = max(ans, dp(i)+1); 으로 해도 된다.
	}

	cout << ans+1 << endl;

	return 0;
}
