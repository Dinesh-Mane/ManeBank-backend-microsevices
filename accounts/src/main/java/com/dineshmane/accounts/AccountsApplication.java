package com.dineshmane.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Account Microservice REST API Documentation",
				description = "ManeBank - Accounts Microservice",
				version = "v1",
				contact = @Contact(
						name = "Dinesh Mane",
						email = "dineshmane3030@gmail.com",
						url = "https://github.com/Dinesh-Mane"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/Dinesh-Mane"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "ManeBank Account Microservice REST API Docs",
				url = "https://github.com/Dinesh-Mane"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
