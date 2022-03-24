package com.spring.mvc.controller;

import com.spring.mvc.model.User;
import com.spring.mvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/example", method = RequestMethod.GET)
    public User fetchUserExample() {
        return userService.exampleUser();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public User fetchUserByFirstName(@RequestParam(value = "firstName") String firstName) {
        return userService.fetchUserByFirstName(firstName);
    }

}
