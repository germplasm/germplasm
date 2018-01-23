package com.germplasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@MapperScan("com.germplasm.dao")
public class GermplasmApplication {

	public static void main(String[] args) {
		SpringApplication.run(GermplasmApplication.class, args);
	}
}
