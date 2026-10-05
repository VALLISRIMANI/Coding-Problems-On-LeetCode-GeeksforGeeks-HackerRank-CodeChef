# VOWANX - Rating 1823

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Vowel Anxiety

Utkarsh has recently started taking English-language classes to improve his reading and writing skills. However, he is still struggling to learn English. His teacher gave him the following problem to improve his vowel-identification skills:

There is a string $S$ of length $N$ consisting of lowercase English letters only. Utkarsh has to start from the first letter of the string.
Each time he encounters a vowel (i.e. a character from the set $\{a, e, i, o, u\}$) he has to  **reverse**  the entire substring that came before the vowel.

Utkarsh needs help verifying his answer. Can you print the final string after performing all the operations for him?

### Input Format
- First line will contain $T$, number of test cases. Then $T$ test cases follow.
- The first line of each test case contains $N$, the length of the string.
- The second line contains $S$, the string itself.
### Output Format

For each test case, output in a single line the final string after traversing $S$ from left to right and performing the necessary reversals.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N \leq 10^6$
- Sum of $N$ over all test cases does not exceed $10^6$.
### Sample 1:
Input
Output

```
2
10
abcdefghij
7
bcadage
```

```
hgfeabcdij
gacbade
```

### Explanation:

 **Test case $1$:**  The first letter is a vowel, but there is no substring before it to reverse, so we leave it as it is. Next, we reverse `abcd` and the string becomes `dcbaefghij`. Next we reach the vowel `i` and reverse `dcbaefgh` to get the string `hgfeabcdij`.

 **Test case $2$:**  Initially, we reverse `bc` and the string becomes `cbadage`. Next we reach the vowel `a` and reverse `cbad` to get the string `dabcage`. Finally we reach the vowel `e` and reverse `dabcag` to get the string `gacbade`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T15:46:30.065Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    
    public static String rearrangeString(String s) {
        int n = s.length();
        char[] t = new char[n];  // Initialize the output array
        int l = 0;
        int r = n - 1;
        boolean start = false;

        for (int i = n - 1; i >= 0; i--) {
            if (start) {
                t[l] = s.charAt(i);
                l++;
            } else {
                t[r] = s.charAt(i);
                r--;
            }
            if (isVowel(s.charAt(i))) {  // Check if the character is a vowel
                start = !start;
            }
        }
        return new String(t);  // Convert char array to string
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;  // Check if the character is a vowel
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());  // First line is the number of test cases
        StringBuilder results = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(scanner.nextLine());  // Read the length of the string (not used directly)
            String s = scanner.nextLine();  // Read the string
            String result = rearrangeString(s);
            results.append(result).append("\n");
        }
        System.out.print(results.toString());  // Print all results at once

        scanner.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/VOWANX)