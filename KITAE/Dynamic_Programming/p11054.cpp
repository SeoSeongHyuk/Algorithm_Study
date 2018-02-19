#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

long long d[1000+1];
long long num[1000+1];
int n;

long long leftdp(int n) {

	if (d[n] > 0)
		return d[n];

	long long leftmax = 0;
	for (int i = n - 1; i > 0; i--) {
		if (num[n] > num[i])
			leftmax = max(leftmax, leftdp(i));
	}

	return d[n] = leftmax+1;
}

long long rightdp(int m) {

	if (d[m] > 0)
		return d[m];

	long long rightmax = 0;

	for (int i = m + 1; i < n+1 ; i++) {
		if (num[m] > num[i])
			rightmax = max(rightmax, rightdp(i));
	}

	return d[m] = rightmax + 1;
}

int main() {

	cin >> n;

	for (int i = 1; i <= n; i++) {
		cin >> num[i];
	}

	long long ans, ans1, ans2 = 0;

	for (int i = n; i > 0; i--) {
		for (int i = sizeof(d) / sizeof(long long); i >= 0; i--)
			d[i] = 0;

		ans1 = leftdp(i);
		
		for (int i = sizeof(d) / sizeof(long long); i >= 0; i--)
			d[i] = 0;

		ans2 = rightdp(i);

		ans = max(ans, ans1 + ans2 - 1);
	} 

	cout << ans << endl;

	return 0;
}
