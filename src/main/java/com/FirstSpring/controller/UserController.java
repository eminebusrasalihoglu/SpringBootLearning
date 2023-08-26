package com.FirstSpring.controller;
import com.FirstSpring.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @PostMapping(path = "/user")
    public User saveUser(@RequestBody User user){
        System.out.println("User saved");
        user.setPassword("");
        return user;
    }
    @PostMapping(path = "/users")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All users saved");
        users.forEach(user -> user.setPassword(""));
        return users;
    }
    @GetMapping(path="/header")
    public String getHeader(@RequestHeader("myHeader") String myHeader){
        return myHeader;
    }
}
