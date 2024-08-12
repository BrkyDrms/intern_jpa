package com.etiya.intern_jpa.service.impl;
import com.etiya.intern_jpa.converter.UserJpaConverter;
import com.etiya.intern_jpa.entity.UserJpaEntity;
import com.etiya.intern_jpa.repository.UserJpaRepository;
import com.etiya.intern_jpa.service.IUserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Service
public class UserJpaService implements IUserJpaService {

    @Autowired
    private UserJpaRepository userRepository;
    @Autowired
    private UserJpaConverter userConverter;

    @Override
    public List<UserJpaEntity> getAllUser() {
        List<UserJpaEntity> userEntityList = userRepository.findAll();
        if (CollectionUtils.isEmpty(userEntityList)){
            throw new RuntimeException("Empty Table");
        }
        return userEntityList;

    }
}
