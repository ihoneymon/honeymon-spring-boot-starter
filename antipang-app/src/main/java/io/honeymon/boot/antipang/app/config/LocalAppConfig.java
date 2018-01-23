package io.honeymon.boot.antipang.app.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalAppConfig {

	@Autowired
	AppProperties appProperties;
	
	@Bean
	AntiPang antiPang() {
		return new AntiPang();
	}
	
	@PostConstruct
	public void setUp() {
		System.out.println("App Name: " + appProperties.getName());
		System.out.println("App Version: " + appProperties.getVersion());
	}
	
	static class AntiPang {
		@PostConstruct
		public void setUp() {
			System.out.println("Local!");
		}
	}
}
