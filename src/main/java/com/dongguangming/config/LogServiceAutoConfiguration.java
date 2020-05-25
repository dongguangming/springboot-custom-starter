package com.dongguangming.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dongguangming.service.LogService;

//@Configuration
//@ConditionalOnClass(LogService.class)
public class LogServiceAutoConfiguration {
	Logger logger = LoggerFactory.getLogger(LogServiceAutoConfiguration.class);
	
	//@Bean
	public String logManager() {
		logger.info("**********logManager 自定义 Auto-Configuration*******");
		return new String("dongguangming log");
	}
}