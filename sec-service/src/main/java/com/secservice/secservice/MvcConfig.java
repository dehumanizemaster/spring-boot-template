package com.secservice.secservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
        registry.addViewController("/waiting_token").setViewName("waiting_token");
        registry.addRedirectViewController("/myAPI", "/callAPI");
        registry.addRedirectViewController("/callAPI", "/callAPI");

        //registry.addStatusController("/myAPI", "400");

	}

}
 
