#include <iostream>
#include <string>
using namespace std;

int main() {
	string str;

	while (true) { // 입력할 때마다 출력할 수 있도록 무한반복함
		getline(cin, str); // getline(변수주소, 최대입력가능문자수, 종결문자)
		// getline() : 한줄 전체 읽는 함수
		// Enter키 입력했을 때 전달되는 개행문자를 입력의 끝으로 인식

		if (str == "") { // 입력이 없을 때 종료
			break;
		}
		cout << str << endl; // 한줄 씩 출력
	}

	return 0;
}
