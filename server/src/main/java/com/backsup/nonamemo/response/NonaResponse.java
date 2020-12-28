package com.backsup.nonamemo.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class NonaResponse<T> {

    private T resultData;
    private HttpStatus status = HttpStatus.OK;
    private String exception;
    private LocalDateTime timeStamp;

    public NonaResponse() {}

    public NonaResponse(HttpStatus status) {
        this.status = status;
        this.timeStamp = LocalDateTime.now();
    }

    public NonaResponse(T resultData, HttpStatus status) {
        this.resultData = resultData;
        this.status = status;
        this.timeStamp = LocalDateTime.now();
    }

    public NonaResponse(T resultData) {
        this.resultData = resultData;
        this.timeStamp = LocalDateTime.now();
    }

    public NonaResponse(HttpStatus status, String exception) {
        this.status = status;
        this.exception = exception;
        this.timeStamp = LocalDateTime.now();
    }
}
