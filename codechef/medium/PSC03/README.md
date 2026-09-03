# PSC03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Circle

Define a structure named Circle to represent a circle with a radius. Write a C program to calculate the area and perimeter of a circle and display the results.

### Input Format
- The first and only line of input contains a single number $r$ - The radius of the circle.
### Output Format
- Output on a single line, two space separated numbers - The area and perimeter of the circle with given radius.
### Sample 1:
Input
Output

```
3
```

```
28.27 18.85
```

## Solution

**Language:** c_cpp  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T06:25:54.010Z  

```c_cpp
#include <stdio.h>

const float pi = 3.14159;
// Structure "Circle"
struct Circle {
    double radius;
};

// Function to calculate the area of a circle
double calculateArea(struct Circle c) {
    return pi * c.radius * c.radius; 
}

// Function to calculate the perimeter (circumference) of a circle
double calculatePerimeter(struct Circle c) {
    return 2 * pi * c.radius; 
}

int main() {
    // Declare variables to store detail for the circle
    struct Circle circle;

    // Input radius of the circle
  
    scanf("%lf", &circle.radius);

    // Calculate and output the Area and Perimeter of the circle
    printf("%.2lf ", calculateArea(circle));
    printf("%.2lf", calculatePerimeter(circle));


    return 0;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PSC03)