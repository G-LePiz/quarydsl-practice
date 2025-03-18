package com.example.quarydsl.domain.user.repository;

import com.example.quarydsl.domain.user.entity.QUser;
import com.example.quarydsl.domain.user.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepositoryQuary{

    QUser qUser = QUser.user;

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<User> findAllUsers() {
        return jpaQueryFactory.select(qUser)
                .from(qUser)
                .fetch();
    }
}
