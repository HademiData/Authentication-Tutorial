package com.HademiPoint.Auth_service;

import com.HademiPoint.Auth_service.Role.Role;
import com.HademiPoint.Auth_service.auth.AuthenticationService;
import com.HademiPoint.Auth_service.auth.RegisterRequest;
import com.HademiPoint.Auth_service.config.JwtConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import static com.HademiPoint.Auth_service.Role.Role.ADMIN;
import static com.HademiPoint.Auth_service.Role.Role.MANAGER;

@SpringBootApplication
@EnableConfigurationProperties(JwtConfig.class)
public class AuthServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	){
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token:" + service.register(admin).getToken());

			var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token:" + service.register(manager).getToken());

		};
	}
}
