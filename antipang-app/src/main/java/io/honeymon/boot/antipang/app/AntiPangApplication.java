package io.honeymon.boot.antipang.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.boot.system.ApplicationPidFileWriter;

@SpringBootApplication(exclude= {ThymeleafAutoConfiguration.class})
public class AntiPangApplication {

	public static void main(String[] args) {
		/**
		 * 메서드 체이닝 지원
		 */
//		SpringApplication.run(AntiPangApplication.class, args);
		
		SpringApplication app = new SpringApplication(AntiPangApplication.class);
		//app 구동시 초기구성 가능
		app.run(args);
	}
}
