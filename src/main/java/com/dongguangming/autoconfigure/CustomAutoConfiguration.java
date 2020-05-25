package com.dongguangming.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({ String.class })
public class CustomAutoConfiguration {
	Logger logger = LoggerFactory.getLogger(CustomAutoConfiguration.class);
	
	//@Bean
	public String cacheManager() {
		logger.info("**********自定义 Auto-Configuration*******");
		return new String("dongguangming");
	}
}