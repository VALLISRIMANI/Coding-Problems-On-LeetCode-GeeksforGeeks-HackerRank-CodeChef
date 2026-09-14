# CHEFROMAN - Rating 940

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T12:03:21.794Z  

```java

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        while (t-- > 0) {
            String n = scanner.nextLine();
            BigInteger num = new BigInteger(n);
            BigInteger result = num.add(BigInteger.ONE);
            System.out.println(result.toString());
        }

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFROMAN)