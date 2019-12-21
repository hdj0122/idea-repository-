package com.offcn.repository;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019-12-19 09:45
 * @Description:
 */
public interface UserRepository extends JpaRepository<User,Integer> {

}
