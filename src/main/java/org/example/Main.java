package org.example;


import org.example.store.model.*;
import org.example.store.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Masha",26);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }
}