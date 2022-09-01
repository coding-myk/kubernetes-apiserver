package com.coding.apiserver.resource;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 *
 * @param <T> The type of data that is deserialized from response body
 */
public class ApiResponse<T> {

    private boolean isSuccessful;
    private int statusCode;
    private Map<String, List<String>> headers;
    private String message;
    private T data;

    public ApiResponse() {
    }

    /**
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     */
    public ApiResponse(boolean isSuccessful, int statusCode, String message, Map<String, List<String>> headers) {
        this(isSuccessful, statusCode, message, headers, null);
    }

    /**
     * @param statusCode The status code of HTTP response
     * @param headers The headers of HTTP response
     * @param data The object deserialized from response bod
     */
    public ApiResponse(boolean isSuccessful, int statusCode, String message, Map<String, List<String>> headers, T data) {
        this.isSuccessful = isSuccessful;
        this.statusCode = statusCode;
        this.message = message;
        this.headers = headers;
        this.data = data;
    }


    public int getStatusCode() {
        return statusCode;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public T getData() {
        return data;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }
}
