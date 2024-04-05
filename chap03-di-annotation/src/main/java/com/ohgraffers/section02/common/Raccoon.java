package com.ohgraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  Primary 는 하나 이상 설정 불가
public class Raccoon implements Animal{

    @Override
    public void eat() {
        System.out.println("너구리가 돈까스덮밥을 먹어요");
    }
}
