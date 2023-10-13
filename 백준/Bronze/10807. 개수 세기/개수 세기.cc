#include <iostream>
using namespace std;
int main(void)
{
    int n, a, b, count = 0;

    cin >> n;
    int* array = new int[n];

    for (int i = 0; i < n; i++) {
        cin >> a;
        array[i] = a;
    }

    cin >> b;

    for (int i = 0; i < n; i++)
    {
        if (b == array[i])
            count++;
    }
    cout << count;

    return 0;
}