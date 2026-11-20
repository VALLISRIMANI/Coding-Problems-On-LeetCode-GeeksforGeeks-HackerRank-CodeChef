# OELXEW19 - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Array Length Property

In this task, you need to print the number of elements in an array using the array's length property. Complete the following code:

```
class Codechef {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int size = __ ; 
        System.out.println("Array Size: " + size);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T06:11:57.973Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/OELXEW19)