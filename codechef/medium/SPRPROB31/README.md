# SPRPROB31

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Create Fruit API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal**  :
Create a simple Spring Boot GET API to provide information about fruits. You will practice creating endpoints that return single objects and lists of objects as JSON.

 **Your Task :** 

- Create an endpoint to return Apple
- URL: /api/fruits/apple

 **Expected Output:** 

```
{
  "name": "Apple",
  "taste": "Sweet"
}

```

- Create an endpoint to return Banana
- URL: /api/fruits/banana

 **Expected Output:** 

```
{
  "name": "Banana",
  "taste": "Sweet"
}

```

- Create an endpoint to return Lemon
- URL: /api/fruits/lemon

 **Expected Output:** 

```
{
  "name": "Lemon",
  "taste": "Sour"
}

```

- Create an endpoint to return all fruits
- URL: /api/fruits/all

 **Expected Output:** 

```
[
  { "name": "Apple", "taste": "Sweet" },
  { "name": "Banana", "taste": "Sweet" },
  { "name": "Lemon", "taste": "Sour" }
]

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-22T10:43:21.314Z  

```cpp
            new Fruit("Banana", "Sweet"), 
        return Arrays.asList(
            new Fruit("Apple", "Sweet"), 
    @GetMapping("/all") 
    public List<Fruit> getAllFruits() {

    // TODO 4: Create an endpoint to return a list of all fruits
    }
        return new Fruit("Lemon", "Sour");
    public Fruit getLemon() {
        // Return a Fruit object with name "Lemon" and taste "Sour"
    @GetMapping("/lemon")  
    // TODO 3: Create an endpoint to return Lemon

    }
        return new Fruit("Banana", "Sweet");
        // Return a Fruit object with name "Banana" and taste "Sweet"
    public Fruit getBanana() {
    @GetMapping("/banana")  
    // TODO 2: Create an endpoint to return Banana

```

---

[View on CodeChef](https://www.codechef.com/problems/SPRPROB31)