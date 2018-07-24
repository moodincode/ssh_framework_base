package com.moodincode.service;

import com.moodincode.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * createBy: moodincode
 * createDate: 2018/7/23 14:56
 * lastModifyDate: 2018/7/23 14:56
 * description:
 */
public interface UserService {
    public void save(User user);

    public void update(User user);
    public User getById(Serializable id);
    public List<User> findAll();
}
