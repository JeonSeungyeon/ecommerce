package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, User!";
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<User> getUser(@PathVariable Long id) {
//        // 사용자 조회 로직
//    }
//
//    @PostMapping
//    public ResponseEntity<User> createUser(@RequestBody User user) {
//        // 사용자 생성 로직
//    }
}

