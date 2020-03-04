package com.boyarsky.apiservice.dto;

public class AuthResponseDto {
    private String accessToken;
    private String tokenType = "Bearer";

    public AuthResponseDto(String accessToken, String tokenType) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
    }

    public AuthResponseDto() {
    }

    public AuthResponseDto(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
