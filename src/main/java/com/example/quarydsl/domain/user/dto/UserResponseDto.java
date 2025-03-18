package com.example.quarydsl.domain.user.dto;

import lombok.Getter;

@Getter
public class UserResponseDto {
    private final Long id;
    private final String username;
    private final int age;
    private final String email;

    public UserResponseDto(Long id, String username, int age, String email) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.email = email;
    }
}
