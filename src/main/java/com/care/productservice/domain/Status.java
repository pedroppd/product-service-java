package com.care.productservice.domain;

public enum Status {

   SUCESS(0),
    FAIL(1);

    private final int valueStatus;

    Status(int value) {
        this.valueStatus = value;
    }
}
