package com.kgisl.security.service;


import java.util.List;

import com.kgisl.security.model.User;

public interface UserService {
    public void saveUser(User user);
    public List<Object> isUserPresent(User user);
}