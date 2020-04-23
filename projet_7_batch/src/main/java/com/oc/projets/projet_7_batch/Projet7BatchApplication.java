package com.oc.projets.projet_7_batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//public class Projet7BatchApplication {
public class Projet7BatchApplication extends SpringBootServletInitializer {

	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(Projet7BatchApplication.class);
	  }
	
	public static void main(String[] args) {
		SpringApplication.run(Projet7BatchApplication.class, args);
	}

}
