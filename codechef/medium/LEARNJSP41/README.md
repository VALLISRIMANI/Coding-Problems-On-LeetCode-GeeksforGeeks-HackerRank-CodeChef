# LEARNJSP41

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Changing Characters in a String

Listen

In JavaScript, `strings` are immutable, which means you cannot directly update or change a character in a `string`. For example

```
var name = "Chaf";
name[2] = 'e'; // nothing changes.
console.log(name); // Chaf

```

If you run the above program, you will still get the same string `Chaf`.

However, you can create a new `string` with the desired changes.
Here's an example of how you can replace the character

```
var name = "Chaf"
var newName = name.replace('a', 'e');
console.log(newName); // Chef

```

 **Note:**  If there are multiple occurrences of the substring you're trying to replace within the original string, the replace() method in JavaScript by default only replaces the first occurrence of the substring. For eg:

```
var name = "Chafaf";
var newName = name.replace('a', 'e');
console.log(newName); // Chefaf

```

### Task

Write a program which does the following

- Given a string variable word which has value "Ocygen".
- You now want to fix the typo in the given string.
- Use the syntax explained above to replace 'c' with 'x' in a new variable newWord
- Output the updated newWord to console

## Solution

**Language:** JavaScript  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:01:26.059Z  

```js
// Solution as follows

var word = "Ocygen";
var newWord = word.replace('c', 'x');
console.log(newWord);
```

---

[View on CodeChef](https://www.codechef.com/problems/LEARNJSP41)