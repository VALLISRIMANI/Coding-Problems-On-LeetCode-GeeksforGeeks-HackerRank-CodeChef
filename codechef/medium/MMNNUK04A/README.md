# MMNNUK04A

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Practice Problem - Custom Exception in User API

 **Instructions:** 

- Complete your code first.
- Click on "Run" to start the server and make sure it runs correctly.
- If you make any changes to the code after running, you must run the server again.
- Only after running the server with the latest changes, your submission will reflect the updated solution.
- Do not submit if the server is not running; otherwise, your solution will fail.

 **Goal :** 
Add a new API that updates the email of a user.
If the user does not exist, the API should throw:

```
UserNotFoundException

```

Project Structure

```
src/main/java/com/example/demo
│
├── controller
│     └── UserController.java
│
├── repository
│     └── UserRepository.java
│
├── exception
│     └── UserNotFoundException.java
│
├── model
│     └── User.java
│
└── DemoApplication.java

```

 **Your Task** 
Complete the Complete the Missing Part of code :
Add the following endpoint in `UserController`.

```
PUT /api/users/{id}/email

```

This API should:

- Find the user by id
- Update the email
- Save the updated user

If the user  **does not exist**, throw:

```
UserNotFoundException

```

 **Example Request** 

```
PUT /api/users/1/email

```

Request Body

```
{
  "email": "alice@example.com"
}

```

 **Expected Behavior** 

 **Case 1: User Exists** 
Response:

```
{
  "id": 1,
  "name": "Alice",
  "email": "alice@example.com"
}

```

 **Case 2: User Does NOT Exist** 
Request:

```
PUT /api/users/10/email

```

 **Expected result:** 

```
UserNotFoundException
User not found with id: 10

```

 **Hint** 
Use:

```
userRepository.findById(id)

```

If the user is not found:

```
throw new UserNotFoundException(...)

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T05:07:21.627Z  

```cpp
            .orElseThrow(() -> 
                new UserNotFoundException("User not found with id: " + id)
            );

        // Step 2: Update email
        user.setEmail(updatedUser.getEmail());

        User user = userRepository.findById(id)
        // Step 1: Find user by id
        // Step 3: Save updated user

    public User updateUserEmail(@PathVariable Long id, @RequestBody User updatedUser) {
        return userRepository.save(user);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MMNNUK04A)