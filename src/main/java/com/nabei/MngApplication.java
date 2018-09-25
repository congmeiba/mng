package com.nabei;

import com.nabei.config.DruidConfiguration;
import com.nabei.config.MybatisPlusConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DruidConfiguration.class, MybatisPlusConfig.class})
public class MngApplication {

	public static void main(String[] args) {
		SpringApplication.run(MngApplication.class, args);
	}
}
