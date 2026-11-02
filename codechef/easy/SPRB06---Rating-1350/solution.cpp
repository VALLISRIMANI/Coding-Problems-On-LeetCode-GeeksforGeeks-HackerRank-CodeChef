package com.example.demo.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonBackReference;

// TODO: Mark this class as a JPA Entity so it maps to a database table
@Entity
@Getter
@Setter
public class Device {

    // TODO: Mark this field as the Primary Key
    @Id
    // TODO: Configure the ID to Auto-Increment using the IDENTITY strategy