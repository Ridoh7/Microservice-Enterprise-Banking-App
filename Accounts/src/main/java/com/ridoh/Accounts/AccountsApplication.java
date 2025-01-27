package com.ridoh.Accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.ridoh.accounts.controller") })
@EnableJpaRepositories("com.ridoh.accounts.repository")
@EntityScan("com.ridoh.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "RidohBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Ridoh Lawal",
						email = "ridohlawal96@gmail.com",
						url = "https://www.linkedin.com/in/ridoh-lawal-31b0a3156"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/ridoh-lawal-31b0a3156"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "RidohBank Accounts microservice REST API Documentation",
				url = "https://www.linkedin.com/in/ridoh-lawal-31b0a3156"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}
}
