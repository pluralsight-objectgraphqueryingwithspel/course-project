package com.pluralsight.michaelhoffman.spring.spel;

import com.pluralsight.michaelhoffman.spring.spel.syntax.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ObjectGraphQueryingWithSpelCourseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjectGraphQueryingWithSpelCourseProjectApplication.class, args);
	}

}
