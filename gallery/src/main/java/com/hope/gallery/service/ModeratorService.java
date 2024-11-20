package com.hope.gallery.service;

import com.hope.gallery.enums.UserStatus;

public interface ModeratorService {
    void changeStatus(String username, UserStatus status);
}
