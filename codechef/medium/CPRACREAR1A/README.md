# CPRACREAR1A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Is It Error - MCQ

What will the following code return as the output if the 1st line of input is 1 and the 2nd line of input is 2?

```
#include <stdio.h>
int main() {
    char a[1],b[1];
    int c;
    scanf("%d", &a);
    scanf("%d", &b);
    c = a + b;
    printf("%d", c);
    return 0;
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T10:11:12.272Z  

```cpp
#include <stdio.h>

int main(void) {
	int n;
	
	// Do not print anything before taking input
	scanf("%d",&n);
	
	// Print the value of n
	printf("%d", n);
}


```

---

[View on CodeChef](https://www.codechef.com/problems/CPRACREAR1A)