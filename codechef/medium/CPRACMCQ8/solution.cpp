#include <stdio.h>

int main() {
    int n, a, b;
    scanf("%d %d %d", &n, &a, &b);

    // Users who get a rating
    int rated_users = n - a;

    // Users who get a rating strictly greater than 1000
    int high_rated_users = n - a - b;

    printf("%d %d\n", rated_users, high_rated_users);

    return 0;
}