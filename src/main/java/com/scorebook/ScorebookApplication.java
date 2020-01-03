package com.scorebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.scorebook"})
@EntityScan(basePackages = {"com.scorebook"})
@EnableJpaRepositories(basePackages = {"com.scorebook"})
public class ScorebookApplication {
	public static void main(String[] args) {
		SpringApplication.run(ScorebookApplication.class, args);
	}

}
