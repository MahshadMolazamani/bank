package com.example.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservices for REST API Documentation",
				description = "Bank Loans microservices for REST API Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Mahshad Developer",
						email = "info@MahshadDeveloper.com",
						url = "https://www.mahshaddeveloper.com"
				),
				license = @io.swagger.v3.oas.annotations.info.License(
						name = "Apache 2.0",
						url = "https://www.apache.org/licenses/LICENSE-2.0"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Bank Loans microservice REST API Documentation",
				url = "https://localhost:8080/swagger-ui.html")
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
