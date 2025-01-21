package com.green.odsay.config;

import com.green.odsay.config.constant.SwaggerConst;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SwaggerConfiguration {
    private final SwaggerConst swaggerConst;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components())
                .info(new Info().title(swaggerConst.getTitle())
                                .description(swaggerConst.getDescription())
                                .version(swaggerConst.getVersion())
                );
    }
}
