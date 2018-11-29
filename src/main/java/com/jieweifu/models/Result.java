package com.jieweifu.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;

@SuppressWarnings("unused")
public class Result {
    private int code = HttpStatus.OK.value();
    private boolean success = true;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object data;

    private int count = 0;

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public Result setData(Object data, Integer code, Integer count) {
        this.data = data;
        this.code = code;
        this.count = count;
        return this;
    }

    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setError(int code, String message) {
        Result model = new Result();
        this.code = code;
        this.message = message;
        this.success = false;
        return this;
    }

    public Result setError(String message) {
        Result model = new Result();
        this.message = message;
        this.success = false;
        return this;
    }

    public int getCode() {
        return code;
    }

    public int getCount() {
        return count;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public String toJSON() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "";
        }
    }
}
