package com.rpramadhan.sbliquibase.main;

import javax.sql.DataSource;

import liquibase.integration.spring.SpringLiquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author rpramadhan
 * Enter point for Liquibase Application
 */
@SpringBootApplication
@ComponentScan("com.rpramadhan.sbliquibase")
public class SBLiquibaseMain {
	
	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SBLiquibaseMain.class, args);
	}
	
	@Bean
	public SpringLiquibase liquibase() {
	    SpringLiquibase liquibase = new SpringLiquibase();
	    liquibase.setChangeLog("classpath:liquibase/liquibase.xml");
	    liquibase.setDataSource(dataSource);
	    return liquibase;
	}

}
