package org.example.expert.domain.auth.dto.response;

import lombok.Getter;

@Getter
public class SigninResponse {

    private final String nickname;

    public SigninResponse(String nickname) {
        this.nickname = nickname;
    }
}
