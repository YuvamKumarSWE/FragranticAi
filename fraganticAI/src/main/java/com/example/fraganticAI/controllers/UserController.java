package com.example.fraganticAI.controllers;

import com.example.fraganticAI.dtos.ApiResponse;
import com.example.fraganticAI.dtos.UserDto; // Import UserDto
import com.example.fraganticAI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity; // Import ResponseEntity
import org.springframework.http.HttpStatus; // Import HttpStatus

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("userService") UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/test")
    public String test() {
        return "This is a test for user controller";
    }

    @GetMapping("/getAll")
    public ResponseEntity<ApiResponse<List<UserDto>>> getAllUsers() {
        List<UserDto> usersList = userService.getAllUsers();
        ApiResponse<List<UserDto>> apiResponse = ApiResponse.success(usersList, "Fetched users successfully");
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("/findById/{uuid}")
    public ResponseEntity<ApiResponse<UserDto>> findUserById(@PathVariable UUID uuid) {
        UserDto userDto = userService.findUserById(uuid);
        return ResponseEntity.ok(ApiResponse.success(userDto, "User found"));
    }

}
