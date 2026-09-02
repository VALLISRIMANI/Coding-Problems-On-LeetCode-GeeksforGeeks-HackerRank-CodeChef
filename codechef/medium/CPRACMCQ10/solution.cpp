#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);

    // Loop for each test case
    while (t--) {
        int x, y;
        scanf("%d %d", &x, &y);

        // Check if the sum is greater than 6
        if (x + y > 6) {
            printf("YES\n");
        } else {
            printf("NO\n");
        }
    }

    return 0;
}