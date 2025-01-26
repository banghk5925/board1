package com.codingrecipe1.board1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codingrecipe1.board1.repository")
public class Board1Application {

	public static void main(String[] args) {
		SpringApplication.run(Board1Application.class, args);
	}

}
