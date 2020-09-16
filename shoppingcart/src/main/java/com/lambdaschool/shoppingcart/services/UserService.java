package com.lambdaschool.shoppingcart.services;

import com.lambdaschool.shoppingcart.models.User;

import java.util.List;


public interface UserService
{

    List<User> findAll();

    List<User> findByNameContaining(String username);

    User findUserById(long id);

    User findByName(String name);

    void delete(long id);

    User save(User user);
}
