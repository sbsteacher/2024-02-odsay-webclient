package com.green.odsay;

import com.green.odsay.config.constant.OdsayApiConst;
import com.green.odsay.model.PubTransPathGetReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
@RequiredArgsConstructor
public class OdsayService {
    private final OdsayApiConst odsayApiConst;
    private final WebClient webClient;

    public String searchPubTransPath(PubTransPathGetReq req) {
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add(odsayApiConst.getParamApiKeyName(), odsayApiConst.getParamApiKeyValue());
        formData.add(odsayApiConst.getParamStartLatName(), req.getStartLat());
        formData.add(odsayApiConst.getParamStartLngName(), req.getStartLng());
        formData.add(odsayApiConst.getParamEndLatName(), req.getEndLat());
        formData.add(odsayApiConst.getParamEndLngName(), req.getEndLng());

        String json = webClient.post().uri(odsayApiConst.getSearchPubTransPathUrl())
                .body(BodyInserters.fromFormData(formData))
                .retrieve() //통신 시도
                .bodyToMono(String.class)//결과물을 String변환
                .block(); //비동기 > 동기


        return json;
    }
}
