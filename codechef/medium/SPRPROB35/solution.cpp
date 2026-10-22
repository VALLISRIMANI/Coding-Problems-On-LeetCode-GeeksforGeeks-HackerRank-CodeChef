
    // POST API - add new todo (starter template)
    public List<Todo> getTodos() {
        return todos;
    }
    // GET API - fetch all todos
    @GetMapping
    private List<Todo> todos = new ArrayList<>();


    // In-memory list to store todos
@RequestMapping("/todos")
public class TodoController {
@RestController
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

package com.example.demo;