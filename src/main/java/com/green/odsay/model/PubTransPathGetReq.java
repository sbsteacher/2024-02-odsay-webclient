package com.green.odsay.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class PubTransPathGetReq {
    @Schema(example = "37.6134436427887")
    private final double startLat;
    @Schema(example = "126.926493082645")
    private final double startLng;
    @Schema(example = "37.5004198786564")
    private final double endLat;
    @Schema(example = "127.126936754911")
    private final double endLng;
}
