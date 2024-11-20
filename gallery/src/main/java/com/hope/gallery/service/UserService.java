package com.hope.gallery.service;


import com.hope.gallery.dto.UserInputDto;
import com.hope.gallery.model.User;

public interface UserService {
    User createUser(UserInputDto userInputDto);
    User findUserById(Long id);
    Long getUsersIdIfExist(String username);
}
