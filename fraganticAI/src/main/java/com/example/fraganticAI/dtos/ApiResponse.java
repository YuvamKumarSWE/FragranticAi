package com.example.fraganticAI.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private T data;
    private String message;
    private boolean success;
    private ApiError error;

    public static <T> ApiResponse<T> success(T data, String message) {
        return new ApiResponse<>(data, message, true, null);
    }

    public static <T> ApiResponse<T> failure(ApiError error) {
        return new ApiResponse<>(null, error.getMessage(), false, error);
    }

}
