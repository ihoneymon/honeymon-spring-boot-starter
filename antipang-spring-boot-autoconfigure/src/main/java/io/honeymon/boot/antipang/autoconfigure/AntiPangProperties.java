package io.honeymon.boot.antipang.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ConfigurationProperties("io.honeymon.antipang")
public class AntiPangProperties {
	private String name;
	private String email;
	private String siteUrl;
	
	public AntiPangProperties(String name, String email, String siteUrl) {
		this.name = name;
		this.email = email;
		this.siteUrl = siteUrl;
	}
}
