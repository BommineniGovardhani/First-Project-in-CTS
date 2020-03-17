package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnooBean1 {
	@Bean(name="SpringAnnoBean")
public AnnoBean callbaen()
	{
		return new AnnoBean();
	}
}
