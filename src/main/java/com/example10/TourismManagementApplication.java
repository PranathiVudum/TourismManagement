package com.example10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example10.Cofig.JwtFilter;

@SpringBootApplication
public class TourismManagementApplication {

    @SuppressWarnings("rawtypes")
    @Bean
    FilterRegistrationBean jwtFilter()
	{
		final FilterRegistrationBean<JwtFilter> registrationBean=new FilterRegistrationBean<JwtFilter>();
			registrationBean.setFilter(new JwtFilter());
		    registrationBean.addUrlPatterns("/api/*");
			return registrationBean;
	
	}
	public static void main(String[] args) {
		SpringApplication.run(TourismManagementApplication.class, args);
	}
}