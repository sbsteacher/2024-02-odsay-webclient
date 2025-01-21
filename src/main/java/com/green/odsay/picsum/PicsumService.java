package com.green.odsay.picsum;

import com.green.odsay.picsum.model.PicsumGetReq;
import com.green.odsay.picsum.model.PicsumGetRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Slf4j
@Service
public class PicsumService {
    private final WebClient webClient;

    public PicsumService() {
        this.webClient = WebClient.builder()
                .baseUrl("https://picsum.photos")
                .defaultHeaders(header ->
                    header.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                )
                .build();
    }

    public List<PicsumGetRes> getPicsum(PicsumGetReq req) {
        List<PicsumGetRes> list = webClient.get()
                               .uri(uriBuilder -> uriBuilder.path("/v2/list")
                                            .queryParam("page", req.getPage())
                                            .queryParam("limit", req.getLimit())
                                            .build())
                               .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<PicsumGetRes>>() {})
                .block();
        log.info("getPicsum: {}", list);
        return list;
    }
}
