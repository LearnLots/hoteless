package com.robin.hoteless.service;

import com.robin.hoteless.model.User;
import com.robin.hoteless.repository.UserRepository;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceTest extends TestCase {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testGetAll() {
        // I need to better understand the correct way to test this
    }

    @Test
    public void testSaveUser() {
        // userRepository is null here - not sure if I was going about testing this the right way
        String firstName = "John";
        String lastName = "Doe";
        User testUser = new User(firstName,lastName);

        userRepository.save(testUser);
    }
}