#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main() {
    char str[] = "ChefSaysHi";
    int upper_case = 0;
    int lower_case = 0;

    for (int i = 0; i < strlen(str); i++) {
        if (isupper(str[i])) {
            upper_case++;
        } else if (islower(str[i])) {
            lower_case++;
        }
    }
    
    printf("%d %d\n", upper_case, lower_case);
    
    return 0;
}