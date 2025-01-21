package com.green.odsay.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PubTransPathVo {
    private final int pathType;
    private final PathInfoVo info;
}
