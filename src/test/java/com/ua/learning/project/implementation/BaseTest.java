package com.ua.learning.project.implementation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void init(){
        System.out.println("init");
    }

    @AfterEach
    public void destroy(){
        System.out.println("destroy");
    }
}
