package com.brianway.learning.java.base.cache.service;

import com.alibaba.fastjson.JSONArray;
import com.brianway.learning.java.base.cache.model.User;

import java.util.Map;

/**
 * Created by Administrator on 2017/3/10 0010.
 */
public interface UserService {
    User add(User user);

    void delete(String id);

    void update(User user);

    User find(String id);

    User findTest(String id);

    Map<String,User> getAll();

    JSONArray test(String id,JSONArray jsonArray);
}
