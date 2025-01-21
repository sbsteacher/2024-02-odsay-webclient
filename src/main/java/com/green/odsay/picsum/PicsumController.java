package com.green.odsay.picsum;

import com.green.odsay.picsum.model.PicsumGetReq;
import com.green.odsay.picsum.model.PicsumGetRes;
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
@RequestMapping("picsum")
public class PicsumController {
    private final PicsumService picsumService;

    @GetMapping
    public List<PicsumGetRes> getPicsum(@ParameterObject @ModelAttribute PicsumGetReq req) {
        return picsumService.getPicsum(req);
    }
}
