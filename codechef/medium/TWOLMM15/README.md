# TWOLMM15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Read Cities File

In this task, you need to read the content of a file and print it line by line using Java. The file `cities.txt` is already saved at the specified location.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/cities.txt
- cities.txt

 **Tasks:** 

- Inside the try block of readFile() method, complete the line.
- Print Each Line Using a Traditional For Loop.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T15:28:30.710Z  

```cpp
            // Handling file-related exceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        String filePath = "cities.txt";  // File path to be read
        readFile(filePath);  // Calling the readFile method
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM15)