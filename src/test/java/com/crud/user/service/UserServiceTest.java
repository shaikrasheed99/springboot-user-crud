package com.crud.user.service;

import com.crud.user.model.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void shouldBeAbleToCallFindAllByIdMethodOfUserRepository() {
        userService.getUserById(1);
        verify(userRepository, times(1)).findById(1);
    }
}
