package org.example.service.impl;

import org.example.mapper.UsersMapper;
import org.example.pojo.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersMapper usersMapper;
    @Override
    public int insert(Users user) {
        return usersMapper.insert(user);
    }
}
