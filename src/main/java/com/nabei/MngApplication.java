package com.nabei;

import com.nabei.config.DruidConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DruidConfiguration.class)
public class MngApplication {

	public static void main(String[] args) {
		SpringApplication.run(MngApplication.class, args);
	}
}
