# Super Reduced String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There is a sequence of words in [CamelCase](https://en.wikipedia.org/wiki/CamelCase) as a string of letters, $s$, having the following properties:

* It is a concatenation of one or more *words* consisting of English letters.
* All letters in the first word are *lowercase*. 
* For each of the subsequent words, the first letter is *uppercase* and rest of the letters are *lowercase*.

Given $s$, determine the number of words in $s$.

**Example**  
$s = \textit{oneTwoThree}$  

There are $3$ words in the string: 'one', 'Two', 'Three'.  

**Function Description**

Complete the *camelcase* function in the editor below.  

camelcase has the following parameter(s):

- *string s*: the string to analyze   

**Returns**  

- *int:* the number of words in $s$  

**Input Format**

A single line containing string $s$.

**Constraints**

* $ 1 \le \text{length of s} \le 10^5 $

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-13T14:28:43.184Z  

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

[View on HackerRank](https://www.hackerrank.com/challenges/camelcase/problem)