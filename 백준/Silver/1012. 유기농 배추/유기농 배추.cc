#include <iostream>
using namespace std;

typedef struct cabbage
{
	int a = 0;
	int flag = 0;
};

void visit(cabbage** mtrx, int x, int y)
{
	mtrx[y][x].flag = 1;
	if (mtrx[y][x + 1].a == 1 && mtrx[y][x + 1].flag == 0) //우
	{
		visit(mtrx, x + 1, y);
	}
	if (mtrx[y + 1][x].a == 1 && mtrx[y + 1][x].flag == 0) //하
	{
		visit(mtrx, x, y + 1);
	}
	if (mtrx[y][x - 1].a == 1 && mtrx[y][x - 1].flag == 0) //좌
	{
		visit(mtrx, x - 1, y);
	}
	if (mtrx[y - 1][x].a == 1 && mtrx[y - 1][x].flag == 0) //상
	{
		visit(mtrx, x, y - 1);
	}
}


int main()
{
	int T, k;
	int m, n;
	cabbage** array;
	int x, y;
	int zirung = 0;
	int* result;

	cin >> T;
	result = new int[T];

	for (int i = 0; i < T; i++)
	{
		zirung = 0;
		cin >> m >> n >> k;

		array = new cabbage * [n + 2]; //2차원 행렬 동적 생성
		for (int j = 0; j < n + 2; j++)
		{
			array[j] = new cabbage[m + 2];
		}

		for (int j = 0; j < k; j++)
		{
			cin >> x >> y;
			array[y + 1][x + 1].a = 1;
		}

		for (int j = 1; j < n + 1; j++)
		{
			for (int k = 1; k < m + 1; k++)
			{
				if (array[j][k].a == 1 && array[j][k].flag == 0)
				{
					visit(array, k, j);
					++zirung;
				}
			}
		}

		result[i] = zirung;
		for (int j = 0; j < n + 2; j++)
			delete[] array[j];
		delete[] array;
	}

	for (int i = 0; i < T; i++)
		cout << result[i] << endl;
	delete[] result;
	return 0;
}