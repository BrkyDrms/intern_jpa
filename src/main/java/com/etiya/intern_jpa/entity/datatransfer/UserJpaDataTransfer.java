package com.etiya.intern_jpa.entity.datatransfer;

public class UserJpaDataTransfer {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserJpaDataTransfer(String name) {
        this.name = name;

    }

    public UserJpaDataTransfer() {
    }
}
