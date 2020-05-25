package com.dongguangming.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dongguangming.annotation.LogServiceType;
import com.dongguangming.service.LogService;
import com.dongguangming.service.impl.FileLogServiceImpl;
import com.dongguangming.service.impl.MysqlLogServiceImpl;
import com.dongguangming.service.impl.StdOutLogServiceImpl;

@Configuration
@ComponentScan
public class LogServiceAutoConfiguration
{
	@Bean
	@LogServiceType("STDOUT")
	@ConditionalOnMissingBean
    public LogService stdOutLogServiceImpl(){
        return new StdOutLogServiceImpl();
    }

    @Bean
    @LogServiceType("FILE")
    @ConditionalOnMissingBean
    public LogService fileLogServiceImpl(){
        return new FileLogServiceImpl();
    }
    
    @Bean
    @LogServiceType("MYSQL")
    @ConditionalOnMissingBean
    public LogService mysqlLogServiceImpl(){
        return new MysqlLogServiceImpl();
    }
}