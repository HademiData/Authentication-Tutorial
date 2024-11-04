package com.HademiPoint.Auth_service.config;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "application.security.jwt")
public class JwtConfig {
    // Getters and Setters
    private String secretKey;
    private long expiration;
    private long refreshTokenExpiration;

}
