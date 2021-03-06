package io.honeymon.boot.antipang.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 초기속성은 속성클래스에서!
 * 
 * @author honeymon
 */
@Getter
@Setter
@NoArgsConstructor
@ConfigurationProperties("io.honeymon.antipang")
public class AntiPangProperties {
	private String name = "honeymon";
	private String email = "ihoneymon@gmail.com";
	private String siteUrl = "http://honeymon.io";

	public AntiPangProperties(String name, String email, String siteUrl) {
		this.name = name;
		this.email = email;
		this.siteUrl = siteUrl;
	}
}
