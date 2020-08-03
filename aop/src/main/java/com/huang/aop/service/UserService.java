package com.huang.aop.service;

import com.huang.aop.annotation.CheckLoginUser;
import com.huang.aop.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Slf4j
@Service
public class UserService {

    @CheckLoginUser("查询所有的学生")
    public List<User> selectUserList(){
        User user = new User(1,"张三",18);
        List<User> userList = new ArrayList<>();
        userList.add(user);
        log.info("正在查询中");
        return userList;
    }
}
