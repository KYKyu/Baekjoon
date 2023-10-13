#include <iostream>
#include <math.h>
using namespace std;
int main()
{
	int x1, x2, y1, y2, r1, r2, T;
	int SmallR, BigR;
	double a;
	int* b;
	cin >> T;

	b = new int[T];

	for (int i = 0; i < T; i++)
	{
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
		r1 < r2 ? (SmallR = r1, BigR = r2) : (BigR = r1, SmallR = r2);
		a = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2)); //두개의 터렛간의 간격
	
		if (a == 0 && r1 == r2)
			b[i] = -1;
		else if (a > r1 + r2 || BigR > SmallR + a)
			b[i] = 0;
		else if (a == r1 + r2 || BigR == SmallR + a)
			b[i] = 1;
		else if (r1 + r2 > a && BigR < SmallR + a)
			b[i] = 2;
		
	}

	for (int i = 0; i < T; i++)
		cout << b[i] << endl;
	delete b;
	return 0;
}