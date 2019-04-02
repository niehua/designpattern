package com.ynh.designpattern.iterator;

import lombok.Getter;

public class Book {

    @Getter
    private String name;

    public Book(String name) {
        this.name = name;
    }
}
