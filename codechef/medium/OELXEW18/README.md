# OELXEW18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Office Departments Capacity

In this example, we demonstrate how to display  **department capacities**  using an  **integer**  array in Java. We also show how to determine the total number of departments using the length property.

 **When executed, the code will show:** 

```
Number of Departments: 4  
Capacity of Department 1: 10  
Capacity of Department 2: 15  
Capacity of Department 3: 8  
Capacity of Department 4: 20

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:11:45.478Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Initialize an array with department capacities
        int[] departmentCapacities = {10, 15, 8, 20};

        // Use the array length property to print the total number of departments
        System.out.println("Number of Departments: " + departmentCapacities.length);

        // Display individual department capacities without a loop
        System.out.println("Capacity of Department 1: " + departmentCapacities[0]);
        System.out.println("Capacity of Department 2: " + departmentCapacities[1]);
        System.out.println("Capacity of Department 3: " + departmentCapacities[2]);
        System.out.println("Capacity of Department 4: " + departmentCapacities[3]);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OELXEW18)