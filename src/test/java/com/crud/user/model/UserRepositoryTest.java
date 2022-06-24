package com.crud.user.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void shouldBeAbleToSaveUser() {
        User ironman = new User(1, "ironman", 21);
        userRepository.save(ironman);

        User user = userRepository.findById(1).get();

        assertEquals(ironman.getId(), user.getId());
        assertEquals(ironman.getName(), user.getName());
        assertEquals(ironman.getAge(), user.getAge());
    }

    @Test
    void shouldBeAbleToUpdateUser() {
        User updatedIronman = new User(1, "ironman", 31);
        userRepository.save(updatedIronman);

        User user = userRepository.findById(1).get();

        assertEquals(updatedIronman.getId(), user.getId());
        assertEquals(updatedIronman.getName(), user.getName());
        assertEquals(updatedIronman.getAge(), user.getAge());
    }
}
