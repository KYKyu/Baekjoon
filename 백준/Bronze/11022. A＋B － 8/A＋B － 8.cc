#include <iostream>
using namespace std;
int main(void)
{
    int t;
    int a, b;
    cin >> t;
    for (int i = 1; i <= t; i++){
        cin >> a >> b;
        cout << "Case #" << i << ": " << a << " + " << b << " = " << a + b << endl;
    }
    return 0;
}