package com.example.APIPractice;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class APIEndPoints {
    HashMap<String,User> userDB = new HashMap<>();
    @PostMapping("/signUpUser")
    public String signUpUser(@RequestBody User user){
        String regNo = user.getRegNo();
        userDB.put(regNo,user);
        return "Succesfully registered!";
    }

    @GetMapping("/getUser/{regNo}")
    public User getUser(@PathVariable("regNo") String regNo){
        return userDB.get(regNo);
    }
}