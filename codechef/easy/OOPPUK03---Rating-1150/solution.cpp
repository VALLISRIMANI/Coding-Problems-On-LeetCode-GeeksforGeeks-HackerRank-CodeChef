@RestController


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.validation.Valid;

import com.example.demo.service.ProductService;

import com.example.demo.model.Product;

package com.example.demo.controller;
public class ProductController {
