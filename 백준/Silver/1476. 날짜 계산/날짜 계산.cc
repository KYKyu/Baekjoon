#include <stdio.h>
#include <iostream>
using namespace std;
int main(void)
{
	int E, S, M; //지구, 태양, 달, 1~15, 1~28, 1~19
	int e = 0, s = 0, m = 0;
	int y = 0;
	cin >> E >> S >> M;
	if (1 > E && E > 15 && 1 > S && 28 < S && 1 > M && 1 > 19)
	{
		printf("정상적이지 않은 값입니다.");
	}
	while (e != E || s != S || m != M)
	{
		e++;
		s++;
		m++;
		if (e == 16)
		{
			e = 1;
		}
		if (s == 29)
		{
			s = 1;
		}
		if (m == 20)
		{
			m = 1;
		}
		y++;
	}
	printf("%d", y);

	return 0;
}