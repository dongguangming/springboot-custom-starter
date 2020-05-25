package com.dongguangming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.dongguangming.condition.MongoDBDatabaseTypeCondition;
import com.dongguangming.condition.MySQLDatabaseTypeCondition;
import com.dongguangming.dao.UserDAO;
import com.dongguangming.dao.impl.JdbcUserDAO;
import com.dongguangming.dao.impl.MongoUserDAO;


//@Configuration
public class DbConfig
{
    @Bean
    @Conditional(MySQLDatabaseTypeCondition.class)
    public UserDAO jdbcUserDAO(){
        return new JdbcUserDAO();
    }

    @Bean
    @Conditional(MongoDBDatabaseTypeCondition.class)
    public UserDAO mongoUserDAO(){
        return new MongoUserDAO();
    }
}