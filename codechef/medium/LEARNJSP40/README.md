# LEARNJSP40

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Outputting Characters from a String

Listen

In a string, characters are indexed from left to right. For instance, in a string named  **hello**  the first character is at index 0, while the last is at index str.length-1 (i.e., at the 4th index).

We use the concept of `indexing` which means every character in a `string` corresponds to a number called the `index number`

```
               0 1 2 3 4 5 6 7  - index number
     for eg - "C o d e C h e f"

```

Following are some of the ways we can access a specific character in a string in javascript:

- using square brackets notation [ ]

```
var str = 'hello';
console.log(str[1]); // e

```

When we try to access a character whose index is equal to or larger than the string length, the square brackets [] return  **undefined**.

```
var str = 'string';
console.log(str[999]); // undefined

```

- using charAt() method This method will return the character at a specified index in a string. The method takes in a parameter, an integer that represents the index of the character to be returned. The syntax for usage is string.charAt(index).

```
var str = 'string';
console.log(str.charAt(0)); // s
//If no character is found, the method returns an empty string.
var str = 'string';
console.log(str.charAt(999)); // ''

```

 **Note** 

- Indexing always starts from 0 when going left to right.
- So the first character of a string str is s[0], the second is s[1], and so on.
### Task

Write a program which does the following

- Create a string variable word and assign the text Programming to it
- Print the characters o and r from the string word in separate lines using the syntax defined above

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:01:04.174Z  

```js
//Solution as follows

var word = "Programming";

console.log(word[2]);
console.log(word[1]);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP40)