
package com.etiya.intern_jpa.controller;

import com.etiya.intern_jpa.entity.UserJpaEntity;
import com.etiya.intern_jpa.service.IUserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserJpaController {

    @Autowired
    private IUserJpaService userService;

    @GetMapping("/users")
    public ResponseEntity<List<UserJpaEntity>> getAllUsers() {
        List<UserJpaEntity> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }
}
