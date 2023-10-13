#include <iostream>
using namespace std;

int main(void)
{
    int round, left_n, right_n;
    unsigned long long* result;
    cin >> round;
    result = new unsigned long long[round];

    for (int i = 0; i < round; i++) {
        result[i] = 1;
    }

    for (int i = 0; i < round; i++) {
        cin >> left_n >> right_n;

        for (int j = 1; j <= left_n; j++) {
            result[i] = result[i] * right_n / j;
            right_n--;
        }
    }

    for (int i = 0; i < round; i++) {
        if (i == round - 1) {
            cout << result[i];
        }
        else
            cout << result[i] << "\n";
    }

    delete[] result;

    return 0;
}