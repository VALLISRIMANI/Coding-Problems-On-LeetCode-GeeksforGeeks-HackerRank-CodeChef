# TWOLMM14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Read and Print File Contents

In this example, we have read the content of a text file and printed it to the console. The file `usernames.txt` is already saved at the specified location.

 **File Path:** 
You can use either of the below paths:

- /home/chef/workspace/usernames.txt
- usernames.txt

Observe the function implementation, and click the "Submit" button to run the tests.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-22T15:22:46.518Z  

```cpp
public class Codechef {
    public static void main(String[] args) {
        try {
            // Read all lines from the file and store them in an ArrayList
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get("usernames.txt")));

            // Print each line using a traditional for loop
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/TWOLMM14)