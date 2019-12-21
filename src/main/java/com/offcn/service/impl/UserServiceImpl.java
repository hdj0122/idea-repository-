package com.offcn.service.impl;

import com.offcn.pojo.User;
import com.offcn.repository.UserRepository;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019-12-19 15:17
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findOne(Integer id) {
        //userRepository.findById(id).get();
        return userRepository.getOne(id);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void update(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }
}
