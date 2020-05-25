package com.dongguangming.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.dongguangming.dao.UserDAO;

public class JdbcUserDAO implements UserDAO {

	@Override
    public List<String> getAllUserNames()
    {
        System.out.println("**** Getting usernames from RDBMS *****");
        return Arrays.asList("Siva","Prasad","Reddy");
    }
}
