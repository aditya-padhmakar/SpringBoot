package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("")
    public List<User> showUsers()
    {
        return(this.userService.getUsers());
    }

    @GetMapping("/{id}")
    public User showUser(@PathVariable int id)
    {
        return this.userService.getUser(id);
    }

    @PostMapping("")
    public String createUser(@RequestBody User u)
    {
//        if(this.userService.addUser(u)!=null)
//        {
//            return "added successfully";
//        }
//        else
//        {
//            return "duplicate email";
//        }
        return  this.userService.addUser(u);
    }

    @DeleteMapping("/{id}")
    public User delUser(@PathVariable int id)
    {
        return userService.deleteUser(id);
    }



}
