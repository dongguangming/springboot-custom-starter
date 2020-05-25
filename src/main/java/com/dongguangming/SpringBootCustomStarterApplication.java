package com.dongguangming;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dongguangming.autoconfigure.CustomAutoConfiguration;
import com.dongguangming.dao.impl.JdbcUserDAO;
import com.dongguangming.service.LogService;


/**
 * @author dgm
 * @describe ""
 */
@SpringBootApplication(exclude = { CustomAutoConfiguration.class })
public class SpringBootCustomStarterApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory
			.getLogger(SpringBootCustomStarterApplication.class);

	@Autowired
	LogService logService;
	
	public static void main(String[] args) {
		System.setProperty("dbType", "MYSQL");
		//System.setProperty("logType", "FILE");

		SpringApplication applicationContext = new SpringApplication(
				SpringBootCustomStarterApplication.class);

		// app.setBannerMode(Banner.Mode.OFF);
		applicationContext.setLogStartupInfo(false);
		ConfigurableApplicationContext c = applicationContext.run(args);
		List<String> packages = AutoConfigurationPackages.get(c);
		System.out.println("要扫描的包是packages: " + packages);

		String[] beanNames = c.getBeanDefinitionNames();
		List<String> beans = Arrays.asList(beanNames);
		// System.out.println(Arrays.asList(beanNames));
		beans.forEach(bean -> {
			if (bean.contains("UserDAO") || bean.contains("cacheManager")
					|| bean.contains("LogService")) {

				System.out.println(bean);

			}
		});

		// JdbcUserDAO jdbcUserDAO= (JdbcUserDAO) c.getBean("jdbcUserDAO");
		// System.out.println(jdbcUserDAO.getAllUserNames());
		// SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logService.print("输入参数是：" +Arrays.asList(args));
	}
}