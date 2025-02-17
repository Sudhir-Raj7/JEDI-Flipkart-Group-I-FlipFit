package com.flipkart.business;

import com.flipkart.bean.*;
import com.flipkart.dao.GymDao;
import com.flipkart.dao.UserDao;
import com.flipkart.utils.DbUtils;

import java.util.*;

public class RegistrationService {

    public static DbUtils dbutils=new DbUtils();

    public void createUser(String username,String password,String name, String phone,String email, int age, String roleId)
    {
        String id = "0" + Integer.toString(1+dbutils.getTableCnt("User"));
        User user = new User(id, username,  password, name,phone, email,  age, roleId);
        UserDao userDao = new UserDao();
        userDao.addUser(user);


    }

    public void createGym(String name, String address, String city, String gymOwnerId)
    {
        String id = "0" + Integer.toString(1+dbutils.getTableCnt("Gym"));
        Gym gym = new Gym(id,name,address, city, gymOwnerId, false);
        GymDao gymDao = new GymDao();
        gymDao.addGym(gym);


    }
}
