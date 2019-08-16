package com.igorkhromov.controller;

import com.igorkhromov.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @GetMapping("/author")
    public ResponseEntity<User> getRandomInteger() throws Exception {
        return new ResponseEntity<>(new User("Jack", "London"), HttpStatus.OK);
    }
}
