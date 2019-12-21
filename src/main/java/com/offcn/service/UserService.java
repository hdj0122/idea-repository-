package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019-12-19 15:17
 * @Description:
 */
public interface UserService {
    List<User> findAll();

    User findOne(Integer id);

    void save(User user);

    void update(User user);

    void deleteById(Integer id);
}
