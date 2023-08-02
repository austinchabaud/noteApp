package com.devmountain.noteApp.services;

import java.util.List;

import com.devmountain.noteApp.dtos.UserDto;

import jakarta.transaction.Transactional;

public interface UserService {
    @Transactional
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);

}