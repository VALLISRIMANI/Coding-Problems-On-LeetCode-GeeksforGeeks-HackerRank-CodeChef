# DCTRHJ38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Two String Variables

In this example, we will demonstrate how the `==` operator compares string references in Java.

 **Expected Output:** 

```
str1 == str2: false
str1 == str3: false
str2 == str3: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T12:42:00.937Z  

```java
class Codechef {
    public static void main(String[] args) {
        // Declaring string literals
        String str1 = "Java";  // Stored in the String Pool
        String str2 = "JAVA";  // Different value, stored in the String Pool
        String str3 = new String("Java");  // New String but at diffrent memory location

        // Comparing references using '=='
        System.out.println("str1 == str2: " + (str1 == str2));  // false, different content, different references
        System.out.println("str1 == str3: " + (str1 == str3));  // false, str3 is at different memory location
        System.out.println("str2 == str3: " + (str2 == str3));  // false, content is not same
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DCTRHJ38)