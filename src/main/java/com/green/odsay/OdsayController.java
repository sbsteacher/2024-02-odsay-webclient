package com.green.odsay;

import com.green.odsay.model.PubTransPathGetReq;
import com.green.odsay.model.PubTransPathVo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("odsay")
public class OdsayController {
    private final OdsayService odsayService;

    @GetMapping("pub-trans-path")
    public List<PubTransPathVo> searchPubTransPath(@ParameterObject @ModelAttribute PubTransPathGetReq req) {
        log.info("searchPubTransPath-req: {}", req);
        return odsayService.searchPubTransPath(req);
    }
}
