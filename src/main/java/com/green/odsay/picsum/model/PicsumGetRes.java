package com.green.odsay.picsum.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;

@Getter
@ToString
public class PicsumGetRes {
    private String id;
    private String author;
    @JsonAlias("download_url")
    private String downloadUrl;
}
