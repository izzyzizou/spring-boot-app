//package com.userinfo.code;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class CorsConfig {
//
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurerAdapter() {
//			public void addCorsMappings(CorsRegistry registry) {
//				registry
//					.addMapping("/**")
//					.allowedMethods("GET", "POST", "PUT", "DELETE")
//					.allowedOrigins("*")
//					.allowedHeaders("*");
//			}
//		};
//	}
//
//}
