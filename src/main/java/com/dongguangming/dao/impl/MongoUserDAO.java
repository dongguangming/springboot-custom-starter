package com.dongguangming.dao.impl;

import java.util.Arrays;
import java.util.List;

import com.dongguangming.dao.UserDAO;

public class MongoUserDAO implements UserDAO {

	 @Override
	    public List<String> getAllUserNames()
	    {
	        System.out.println("**** Getting usernames from MongoDB *****");
	        return Arrays.asList("Bond","James","Bond");
	    }

}
