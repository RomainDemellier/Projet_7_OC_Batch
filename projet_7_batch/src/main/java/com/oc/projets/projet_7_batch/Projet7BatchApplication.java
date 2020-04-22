package com.oc.projets.projet_7_batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Projet7BatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(Projet7BatchApplication.class, args);
	}

}
