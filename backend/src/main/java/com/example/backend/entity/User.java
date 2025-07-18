package com.example.backend.entity;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    //defining 4 variables
    private long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    //getter
    public long getId() {
        return id;
    }
    //setter
    public void setId(long id) {
        this.id = id;
    }

    //getter
    public String getUsername() {
        return username;
    }

    //setter
    public void setUsername(String username) {
        this.username = username;
    }

    //getter
    public String getEmail() {
        return email;
    }

    //setter
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonIgnore
    //getter
    public String getPassword() {
        return password;
    }

    //setter
    public void setPassword(String password) {
        this.password = password;
    }




}
