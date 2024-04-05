package com.ohgraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가고기를 뜯어먹습니다.");
    }
}
