package com.green.odsay.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class PathInfoVo {
    private final int totalTime;
    private final int payment;
    private final double totalDistance;
}
