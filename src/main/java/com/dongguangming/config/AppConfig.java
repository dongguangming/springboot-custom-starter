package com.dongguangming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dongguangming.annotation.DatabaseType;
import com.dongguangming.dao.UserDAO;
import com.dongguangming.dao.impl.JdbcUserDAO;
import com.dongguangming.dao.impl.MongoUserDAO;

@Configuration
@ComponentScan
public class AppConfig
{
	//@Bean
    @DatabaseType("MYSQL")
    public UserDAO jdbcUserDAO(){
        return new JdbcUserDAO();
    }

    @Bean
    @DatabaseType("MONGO")
    public UserDAO mongoUserDAO(){
        return new MongoUserDAO();
    }
}