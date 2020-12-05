package com.coursewebservices.webservices.config;

import com.coursewebservices.webservices.entities.User;
import com.coursewebservices.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Maria Brown", "maria@gmail.com",
                "9888888888", "123456");
        User user2 = new User(null, "Alex Green", "alex@gmail.com",
                "9777777777", "123456");

        userRepository.saveAll(Arrays.asList(user1,user2));
    }
}
