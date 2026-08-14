# Mini-Max Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.  

**Example**   
$arr = [1, 3, 5, 7, 9]$

The minimum sum is $1 + 3 + 5 + 7 = 16$ and the maximum sum is $3 + 5 + 7 + 9 = 24$.  The function prints

    16 24
    
**Function Description**  

Complete the $miniMaxSum$ function with the following parameter(s):

- $arr[5]$: an array of $5$ integers  

**Print**   
  
Print two space-separated integers on one line: the minimum sum and the maximum sum of $4$ of $5$ elements.No value should be returned. 

**Note** For some languages, like C, C++, and Java, the sums may require that you use a long integer due to their size.

**Input Format**

A single line of five space-separated integers.

**Constraints**

$1 \le arr[i] \le 10^9$  

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-14T15:27:34.750Z  

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        long minimum = sum - arr.get(4);
        long maximum = sum - arr.get(0);
        System.out.print(minimum + " " + maximum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/mini-max-sum/problem)