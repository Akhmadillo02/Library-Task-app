package uz.ahmadillo02.librarytaskapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.ahmadillo02.librarytaskapp.entity.User;
import uz.ahmadillo02.librarytaskapp.service.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/saveUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }


    @DeleteMapping("/deleteUser")
    public String deleteUSer(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
