#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int d[1000001]; // 배열 선언

int recursion(int n) {

	if (n == 1) return 0; // 종료조건(n==1)일 때 종료, 0을 리턴하는 이유는 횟수를 구하는 문제이기 때문.
	//경우의 수를 구하는 문제인 경우 return 1을 해주어야 한다. 그 경우에 대한 수를 구하는 것이므로

	if (d[n] > 0) return d[n]; // 메모이제이션, 경우의 수들에 대한 횟수를 더하면서 배열이 더 이상 0이 아니게 된다.
	// 그러므로 배열이 0보다 크면 이전에 연산한 값일 때 배열에 저장되이 있으므로 그 값을 return 해주어 연산을 반복해주는 횟수를 줄이게 된다.

	d[n] = recursion(n - 1) + 1; // 1을 뺀 경우에 대한 경우의 수를 배열에 더해준다.

	if (n % 3 == 0) // 3으로 나눠질 때에 대한 경우의 수를 배열에 더해준다.
		// 최소횟수를 구하기 위한 것이므로 더 작은 값을 구해 d[n]에 대입
		d[n] = min(d[n], recursion(n / 3) + 1);

	if (n % 2 == 0) // 2로 나눠질 때에 대한 경우의 수를 배열에 더해준다.
		d[n] = min(d[n], recursion(n / 2) + 1);

	return d[n];
}

int main() {
	
	int ans = 0;

	cin >> ans;

	cout << recursion(ans) << endl;

	return 0;
}
