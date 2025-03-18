package com.example.quarydsl.domain.user.service;

import com.example.quarydsl.domain.user.dto.UserRequestDto;
import com.example.quarydsl.domain.user.dto.UserResponseDto;
import com.example.quarydsl.domain.user.entity.User;
import com.example.quarydsl.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponseDto save(UserRequestDto requestDto) {
        User user = new User(requestDto.getUsername(), requestDto.getAge(), requestDto.getEmail());
        userRepository.save(user);

        return new UserResponseDto(user.getId(), user.getUsername(), user.getAge(), user.getEmail());
    }

    public List<UserResponseDto> findAll() {
        List<User> all = userRepository.findAllUsers();
        List<UserResponseDto> dtos = new ArrayList<>();
        for (User user : all) {
            dtos.add(new UserResponseDto(user.getId(), user.getUsername(), user.getAge(), user.getEmail()));
        }

        return dtos;
    }
}
