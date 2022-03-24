package com.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestMappingShortcutsController {

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<String> get() {
        return new ResponseEntity<String>("GET Response", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<String> getById(String id) {
        return new ResponseEntity<>("Get Response: " + id, HttpStatus.OK);
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity post() {
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public @ResponseBody ResponseEntity<String> delete() {
        return new ResponseEntity<String>("Delete Response", HttpStatus.OK);
    }

    @PutMapping("/put")
    public @ResponseBody ResponseEntity<String> put() {
        return new ResponseEntity<String>("PUT Response", HttpStatus.OK);
    }

    @PatchMapping ("/patch")
    public @ResponseBody ResponseEntity<String> patch() {
        return new ResponseEntity<String>("PATCH Response", HttpStatus.OK);
    }


}
