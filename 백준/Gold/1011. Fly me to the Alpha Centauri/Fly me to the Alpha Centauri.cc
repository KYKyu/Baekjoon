#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int T;
	int x, y, r;
	int move;
	int* result;

	scanf("%d", &T);
	result = new int[T];

	for (int i = 0; i < T; i++)
	{
		scanf("%d %d", &x, &y);
		r = y - x;
		move = sqrt(r);
		if (r - move > pow(move, 2))
			move = move + 1;
		result[i] = move * 2;
		if (r <= pow(move, 2))
			result[i] = result[i] - 1;

	}

	for (int i = 0; i < T; i++)
	{
		printf("%d\n", result[i]);
		//cout << result[i] << endl;
	}
	delete result;
	return 0;
}