package de.fayedev.ls4apiserver.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringdocConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("LeagueS4 API Server REST API")
                        .description("LeagueS4 API Server REST API documentation for internal usage.")
                        .version("1.0.0")
                        .license(new License().name("GNU Affero General Public License v3.0").url("https://choosealicense.com/licenses/agpl-3.0/"))
                        .contact(new Contact().name("Faye Schipper").url("https://leagues4.com/").email("business@fayedev.de")))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"))
                .components(new Components().addSecuritySchemes("bearerAuth", new SecurityScheme()
                        .name("bearerAuth")
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")));
    }

    @Bean
    public OpenApiCustomiser customGlobalHeaderOpenApiCustomizer() {
        return openApi -> openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations().forEach(operation -> {
            ApiResponses apiResponses = operation.getResponses();
            ApiResponse apiResponseBadRequest = new ApiResponse().description("Bad Request");
            apiResponses.addApiResponse("400", apiResponseBadRequest);
            ApiResponse apiResponseForbidden = new ApiResponse().description("Authentication invalid");
            apiResponses.addApiResponse("403", apiResponseForbidden);
            ApiResponse apiResponseUnauthorized = new ApiResponse().description("Authentication invalid");
            apiResponses.addApiResponse("401", apiResponseUnauthorized);
            ApiResponse apiResponseInternalServerError = new ApiResponse().description("Internal server error");
            apiResponses.addApiResponse("500", apiResponseInternalServerError);
        }));
    }
}
