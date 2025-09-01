package com.example.fraganticAI.services;

import com.example.fraganticAI.dtos.UserDto;
import com.example.fraganticAI.exceptions.UserNotFoundException;
import com.example.fraganticAI.models.Users;
import com.example.fraganticAI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList; // Import ArrayList
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> getAllUsers() {
        List<Users> users = userRepository.findAll();
        List<UserDto> userDtos = new ArrayList<>(); // Initialize a new list for DTOs
        for (Users user : users) {
            userDtos.add(convertToDto(user)); // Add converted DTOs to the list
        }
        return userDtos;
    }

    public UserDto findUserById(UUID uuid){
        Users user = userRepository.findById(uuid).orElseThrow(() -> new UserNotFoundException("User with ID " + uuid+ " not found"));
        return convertToDto(user);
    }

    private UserDto convertToDto(Users user) {
        return new UserDto(user.getUsername(), user.getEmail(), user.isMale());
    }
}
