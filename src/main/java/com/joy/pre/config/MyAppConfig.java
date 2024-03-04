package com.joy.pre.config;

import javax.sql.DataSource;

//import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mysql.cj.jdbc.Driver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.joy"})
public class MyAppConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver ;
	}
	
	@Bean
	public JdbcTemplate jdbTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
	
	return jdbcTemplate;
	
}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource  dataSource= new DriverManagerDataSource();
		
		dataSource.setUsername("root");
		dataSource.setPassword("joy@P1820#dutt");
		dataSource.setUrl("jdbc:mysql://localhost:3306/prescription?useSSL=false");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); 
		return dataSource;
	}
}
