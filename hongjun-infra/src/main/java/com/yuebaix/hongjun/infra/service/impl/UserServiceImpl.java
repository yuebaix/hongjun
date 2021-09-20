package com.yuebaix.hongjun.infra.service.impl;

import com.yuebaix.hongjun.infra.entity.User;
import com.yuebaix.hongjun.infra.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User get(Long id) {
        return new User().setId(id).setName("randomUser");
    }
}
