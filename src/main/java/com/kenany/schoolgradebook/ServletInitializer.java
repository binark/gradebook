package com.kenany.schoolgradebook;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Value("${spring.profiles.active}")
	String profile;

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("profile = " + profile);
		return application.sources(SchoolGradebookApplication.class);
	}

}
