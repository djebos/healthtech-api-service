package com.boyarsky.apiservice.service;

import com.boyarsky.apiservice.entity.user.Role;

public interface UserRolesService {
    Role createOrGetByUid(String uid);
}
