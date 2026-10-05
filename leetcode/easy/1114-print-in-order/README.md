# Print in Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Suppose we have a class:

```
public class Foo {
  public void first() { print("first"); }
  public void second() { print("second"); }
  public void third() { print("third"); }
}

```

The same instance of `Foo` will be passed to three different threads. Thread A will call `first()`, thread B will call `second()`, and thread C will call `third()`. Design a mechanism and modify the program to ensure that `second()` is executed after `first()`, and `third()` is executed after `second()`.

 **Note:** 

We do not know how the threads will be scheduled in the operating system, even though the numbers in the input seem to imply the ordering. The input format you see is mainly to ensure our tests' comprehensiveness.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: "firstsecondthird"
Explanation: There are three threads being fired asynchronously. The input [1,2,3] means thread A calls first(), thread B calls second(), and thread C calls third(). "firstsecondthird" is the correct output.

```

 **Example 2:** 

```
Input: nums = [1,3,2]
Output: "firstsecondthird"
Explanation: The input [1,3,2] means thread A calls first(), thread B calls third(), and thread C calls second(). "firstsecondthird" is the correct output.

```

 

 **Constraints:** 

- nums is a permutation of [1, 2, 3].

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 99.76%)  
**Memory:** 44.1 MB (beats 58.66%)  
**Submitted:** 2026-10-05T15:39:51.387Z  

```java
class Foo {
    private Semaphore s1;
    private Semaphore s2;

    public Foo() {
        s1 = new Semaphore(0);
        s2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        s1.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        s1.acquire();
        printSecond.run();
        s2.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        s2.acquire();
        printThird.run();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/print-in-order/)