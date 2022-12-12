package com.example.employeemanagment.service;

import com.example.employeemanagment.dto.UserRegistrationDto;
import com.example.employeemanagment.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
