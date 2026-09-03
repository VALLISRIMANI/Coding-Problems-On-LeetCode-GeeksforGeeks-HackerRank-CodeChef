#include <stdio.h>

int main() {
    int t;

    // Input for the number of test cases using scanf
    scanf("%d", &t);

    // Loop for each test case
    while (t--) {
        int x, y, a;
        scanf("%d %d %d", &x, &y, &a);

        // Check eligibility: age must be >= X and < Y
        if (a >= x && a < y) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}