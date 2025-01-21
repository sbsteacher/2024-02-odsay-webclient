package com.green.odsay.picsum.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PicsumGetResOrigin {
    private String id;
    private String author;
    private String downloadUrl;

    public PicsumGetResOrigin(String id, String author, @JsonProperty("download_url") String downloadUrl) {
        this.id = id;
        this.author = author;
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
}
