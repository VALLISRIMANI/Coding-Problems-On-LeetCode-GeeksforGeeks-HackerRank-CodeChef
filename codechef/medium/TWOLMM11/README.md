# TWOLMM11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Read Text File

In this task, you need to read the content of a text file and return it as a `String` using Java. The file `data.txt` is already saved at the specified location.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/data.txt
- data.txt

 **Steps to Follow:** 

- The readTextFile function should reference the given file path.
- Use Java’s readString to read the file as a String.
- The function should return the file content as a String.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:23:22.071Z  

```cpp

class Codechef
{
    public static String readFile(String filepath){
        try {
            

            // Write your code here
            String content = Files.readString(Paths.get(filepath));
            return content;


        } catch (IOException e) {
import java.io.IOException;
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM11)