package com.hope.gallery.service.impl;

import com.hope.gallery.dal.UserRepository;
import com.hope.gallery.enums.UserStatus;
import com.hope.gallery.producer.KafkaProducer;
import com.hope.gallery.service.ModeratorService;
import com.hope.gallery.service.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ModeratorServiceImpl implements ModeratorService {
    @Autowired
    KafkaProducer kafkaProducer;

    private final UserRepository userRepository;
    private final UserService userService;

    public ModeratorServiceImpl(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }
@Override
    public void changeStatus(String username, UserStatus status) {
        Long id = userService.getUsersIdIfExist(username);
        userRepository.changeUserStatus(id, status.toString());
    }

}
