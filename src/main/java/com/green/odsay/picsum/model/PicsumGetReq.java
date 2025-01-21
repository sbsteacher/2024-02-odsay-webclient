package com.green.odsay.picsum.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PicsumGetReq {
    @Schema(example = "1")
    private int page;
    @Schema(example = "30")
    private int limit;
}
