package org.omoknoone.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

/* 설명. http://localhost:58000/swagger-ui/index.html */
@OpenAPIDefinition(
        info = @Info(title = "Omok API 명세서",
                description = "Omok user API 명세서",
                version = "v1"))
@Configuration
public class SwaggerConfig {

}
