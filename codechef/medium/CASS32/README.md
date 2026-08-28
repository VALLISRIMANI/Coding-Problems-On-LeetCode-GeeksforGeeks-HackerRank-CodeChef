# CASS32

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Weather Check

Given temperature in fahrenheit as input, find if weather is cold or hot. Its `HOT` out there if temperature is greater than $90^{\text{0}}$ F, else `COLD`.

### Input Format
- The first and only line of input contains single non-negative integer - The temperature.
### Output Format
- Output on the single line: HOT if if temperature is grater than $90^{\text{0}}$ F. else COLD.
### Constraints
- $0 \leq temperature \leq 125$
### Sample 1:
Input
Output

```
90
```

```
COLD
```

### Sample 2:
Input
Output

```
100
```

```
HOT
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:47:21.045Z  

```c_cpp
// Updae your code below this line
#include <stdio.h>

int main() {
    int temperature;
    scanf("%d", &temperature);

    // Expression (temperature > 90) will return either 0 or 1 
    switch(temperature > 90) {   
        case 0:
            printf("COLD");
            break;
        case 1:
            printf("HOT");
            break;




    }

    return 0;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CASS32)