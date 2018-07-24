package com.moodincode.service.impl;

import com.moodincode.dao.UserDao;
import com.moodincode.entity.User;
import com.moodincode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/23 14:57
 * lastModifyDate: 2018/7/23 14:57
 * description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User getById(Serializable id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
