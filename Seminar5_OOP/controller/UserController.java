package Seminar5_OOP.controller;

import java.util.List;

import Seminar5_OOP.model.Repository;
import Seminar5_OOP.model.User;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public void deleteUser(String userId) throws Exception{
        List<User> users = repository.getAllUsers();
        User userFind = null;
        for (User user : users) {
            if (user.getId().equals(userId)) {
                userFind = user;
                break;
            }
        }

        if (userFind == null){
            throw new Exception("User not found");
        }

        repository.deleteUser(userFind);

    }

    public List<User> readAllUsers () {
        return repository.getAllUsers();
    }

    public User updateUser(User user) {
        return repository.updateUser(user);
    }
}