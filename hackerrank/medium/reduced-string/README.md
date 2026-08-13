# Super Reduced String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Reduce a string of lowercase characters in range `ascii[‘a’..’z’]`by doing a series of operations.  In each operation, select a pair of adjacent letters that match, and delete them.  

Delete as many characters as possible using this method and return the resulting string.  If the final string is empty, return `Empty String`

**Example**. 

$s = \text{'aab'}$  

`aab` shortens to `b` in one operation: remove the adjacent `a` characters. 

$s =\text{'abba'}$  

Remove the two 'b' characters leaving 'aa'.  Remove the two 'a' characters to leave ''.  Return 'Empty String'.


**Function Description**

Complete the *superReducedString* function in the editor below.   

superReducedString has the following parameter(s):  

- *string s:* a string to reduce  

**Returns**  

- *string:* the reduced string or `Empty String`  

**Input Format**

A single string, $s$.

**Constraints**

- $1 \le \text{ length of }s \le 100$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T14:28:38.542Z  

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
    // Write your code here
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int len = sb.length();
            
            if (len > 0 && sb.charAt(len - 1) == ch) {
                sb.deleteCharAt(len - 1);
            } else {
                sb.append(ch);
            }
        }
        
        return sb.length() == 0 ? "Empty String" : sb.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/reduced-string/problem)