# LCAS80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T08:47:26.710Z  

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

[View on CodeChef](https://www.codechef.com/problems/LCAS80)