package io.honeymon.boot.antipang.autoconfigure;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ConditionalOnBean(name= "antiPang")
@EnableConfigurationProperties(AntiPangProperties.class)
public class AntiPangAutoConfiguration {

	private AntiPangProperties properties;

	public AntiPangAutoConfiguration(AntiPangProperties properties) {
		this.properties = properties;
	}
	
	@PostConstruct
	public void setUp() {
		log.debug("1st AntiPang[Name: {}, Email: {}]", properties.getName(), properties.getEmail());
	}
}
