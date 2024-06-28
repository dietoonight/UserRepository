package org.example.Configuration;

import org.example.Profiles.HashMapUserRepository;
import org.example.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfig {
    @Bean
    @Profile("hashmap")
    public UserRepository hashMapUserRepository(){
        return new HashMapUserRepository();
    }
}
