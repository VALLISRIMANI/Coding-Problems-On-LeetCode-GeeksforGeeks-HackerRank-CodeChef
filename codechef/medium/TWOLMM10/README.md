# TWOLMM10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Reading a Text File

In this example, we are reading the content of a  **text file**  and storing it into a `String`. The file `data.txt` is already saved at the specified location.

 **File Path:**  You can use either of the below paths:

```
/home/chef/workspace/data.txt

```

```
data.txt

```

Observe the function implementation, and click the "Submit" button to run the tests.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:20:51.234Z  

```cpp
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

class Codechef {
    // Method to read and return file content as a String
    public static String readFile(String filepath) {
        try {
            // Read the entire file as a string
            String content = Files.readString(Paths.get(filepath));

            return content;  // Return file content
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();  // Handle file read errors
        }
    }
```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM10)