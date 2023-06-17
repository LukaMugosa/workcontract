package com.work.contract.workcontract.rest.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Objects;

public class AuthResponse implements Serializable {
    @JsonProperty("access_token")
    private final String accessToken;
    @JsonProperty("refresh_token")
    private final String refreshToken;

    public AuthResponse(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthResponse that = (AuthResponse) o;

        if (!Objects.equals(accessToken, that.accessToken)) return false;
        return Objects.equals(refreshToken, that.refreshToken);
    }

    @Override
    public int hashCode() {
        int result = accessToken != null ? accessToken.hashCode() : 0;
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AuthResponse{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}



