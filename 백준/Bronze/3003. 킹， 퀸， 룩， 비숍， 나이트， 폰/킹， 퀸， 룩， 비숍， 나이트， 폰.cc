//체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
#include <iostream>

using namespace std;
int main()
{
    int a, b, c, d, e, f;
    cin >> a >> b >> c>> d>> e>>f;
    if(0<=a<=10 && 0<=b<=10 && 0<=c<=10 && 0<=d<=10 && 0<=e<=10 && 0<=f<=10)
    {
        cout << 1-a << " " << 1-b << " " << 2-c << " " << 2-d << " " << 2-e << " ";
        cout << 8-f;
    }
    else
    {
        cout << "오류";
        exit(0);
    }
    return 0;
}