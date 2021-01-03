package ru.javamentor.web.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestParam;
import ru.javamentor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.javamentor.service.UserService;

import java.util.List;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("userServiceBean") UserService userService) {

        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getUsers(ModelMap model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
            return "users";
    }

    @GetMapping("/new")
    public String creationForm(ModelMap model) {
        model.addAttribute("user", new User());
        return "new";

    }

    @PostMapping()
    public String createUser(@RequestParam String name, @RequestParam String surname) {
        User user = new User(name,surname);
            userService.createUser(user);
        return "redirect:/";

    }

}
