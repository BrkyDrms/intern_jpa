package com.etiya.intern_jpa.converter;

import com.etiya.intern_jpa.entity.UserJpaEntity;
import com.etiya.intern_jpa.entity.datatransfer.UserJpaDataTransfer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserJpaConverter {

    public List<UserJpaDataTransfer> userEntityListConvertToUserDataTransferList(List<UserJpaEntity> userEntityList){
        List<UserJpaDataTransfer> userJpaDataTransferList =new ArrayList<>();
        for (UserJpaEntity userEntity : userEntityList){
            UserJpaDataTransfer userJpaDataTransfer = new UserJpaDataTransfer(userEntity.getName());
            userJpaDataTransferList.add(userJpaDataTransfer);
        }
        return userJpaDataTransferList;
    }

}
