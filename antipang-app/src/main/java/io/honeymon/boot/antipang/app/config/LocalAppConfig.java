package io.honeymon.boot.antipang.app.config;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalAppConfig {

	@Bean
	AntiPang antiPang() {
		return new AntiPang();
	}
	
	static class AntiPang {
		@PostConstruct
		public void setUp() {
			System.out.println("Local!");
		}
	}
}
