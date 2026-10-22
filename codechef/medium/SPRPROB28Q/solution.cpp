    @GetMapping("/user")
    public String welcomeUser(@RequestParam String name) {

        // TODO: Return a greeting for a normal user
        return "Welcome, " + name + "!";
    }

    // GET /api/welcome/admin?name=YourName
    @GetMapping("/admin")
    public String welcomeAdmin(@RequestParam String name) {

    // GET /api/welcome/user?name=YourName

public class WelcomeController {
@RequestMapping("/api/welcome")
@RestController

import org.springframework.web.bind.annotation.*;

package com.example.demo;