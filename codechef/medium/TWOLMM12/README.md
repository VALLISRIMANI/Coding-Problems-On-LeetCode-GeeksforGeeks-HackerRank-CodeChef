# TWOLMM12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Get File Content Length
- In this task, your goal is to read the content of a text file and return the total number of characters present in the file.
- The text file is already saved at the following location:

```
/home/chef/workspace/content.txt

```

 **Task:** 

- Use Java’s Files.readString(...) method to read the entire content of the file into a String.
- Return the length of that content using the.length() method.
- Handle any IOException that might occur during file reading. If an error occurs, print a suitable error message. Return -1 if the file can't be read.

 **Function Signature:** 

```
public static int getContentLength(String filepath)

```

 **Expected Output:** 

```
11

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T09:27:20.520Z  

```cpp
            
            // Print error message if file reading fails
            System.out.println("Error reading file: " + e.getMessage());
        } catch (IOException e) {
            return content.length();
            // Return the number of characters in the file
            String content = Files.readString(Paths.get(filepath));
            
            // Return -1
            return -1;

        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        String filepath = "/home/chef/workspace/content.txt";
        System.out.println(getContentLength(filepath));
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM12)