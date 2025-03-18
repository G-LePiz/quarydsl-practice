package com.example.quarydsl.domain.user.controller;

import com.example.quarydsl.domain.user.dto.UserRequestDto;
import com.example.quarydsl.domain.user.dto.UserResponseDto;
import com.example.quarydsl.domain.user.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/user")
    public UserResponseDto save(@RequestBody UserRequestDto requestDto) {
        return userService.save(requestDto);
    }

    @GetMapping("/user")
    public List<UserResponseDto> findAll() {
        return userService.findAll();
    }
}
