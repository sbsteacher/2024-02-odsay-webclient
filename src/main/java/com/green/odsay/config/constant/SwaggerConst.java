package com.green.odsay.config.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "constant.swagger-const")
@RequiredArgsConstructor
@ToString
public class SwaggerConst {
    private final String title;
    private final String description;
    private final String version;
}
