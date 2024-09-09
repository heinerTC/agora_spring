package com.agora_spring.agora_spring.controller;

import com.agora_spring.agora_spring.model.Users;
import com.agora_spring.agora_spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HEINER - YULY - SERGIO
 */
@RestController
@RequestMapping("/users")

public class UsersController {

    @Autowired
    private UserService usersService;

    @PostMapping("/new")
    public Users newUsers(@RequestBody Users newUsers) {
        return this.usersService.newUsers(newUsers);
    }

    @GetMapping("/view")
    public Iterable<Users> getAll() {
        return usersService.getAll();
    }

    @PostMapping("/edit")
    public Users updateUsers(@RequestBody Users users) {
        return this.usersService.modifyUsers(users);
    }

    @PostMapping(value = "/(id)")
    public Boolean deleteUser(@PathVariable(value = "id") Long id) {
        return this.usersService.deleteUsers(id);
    }

}
