package com.practice.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class UsersService {

    private final UsersApiController usersApiController;

    @Autowired
    protected UsersService(UsersApiController usersApiController) {
        this.usersApiController = usersApiController;
    }

    public ArrayList<String> getUsers() {
        usersApiController.usersGet();
        return new ArrayList<>();
    }

}
