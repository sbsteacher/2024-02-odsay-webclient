package com.green.odsay.config.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "constant.odsay-api-const")
@RequiredArgsConstructor
@ToString
public class OdsayApiConst {
    private final String baseUrl;
    private final String paramApiKeyName;
    private final String paramApiKeyValue;
    private final String paramStartLatName;
    private final String paramStartLngName;
    private final String paramEndLatName;
    private final String paramEndLngName;
}
