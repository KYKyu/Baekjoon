#include <iostream>
using namespace std;
int main(void)
{
    int a, b, c;
    cin >> a >> b >> c;

    int N = a;

    if (a == b && b == c) {
        cout << 10000 + 1000 * a;
    }
    else if (a == b && b != c) {
        cout << 1000 + 100 * a;
    }
    else if (a == c && b != c) {
        cout << 1000 + 100 * a;
    }
    else if (b == c && c != a) {
        cout << 1000 + 100 * b;
    }
    else {
        if (N < b) 
            N = b;
        if (N < c)
            N = c;
        cout << 100 * N;
    }
    return 0;
}