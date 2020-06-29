package com.rh.mybase.logic;

import com.rh.mybase.entity.User;
import com.rh.mybase.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogicImpl implements UserLogic {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public Boolean checkUserLogin(User user) {
        User deptUser = loginMapper.getUserByUser(user);
        return deptUser != null;
    }
}
