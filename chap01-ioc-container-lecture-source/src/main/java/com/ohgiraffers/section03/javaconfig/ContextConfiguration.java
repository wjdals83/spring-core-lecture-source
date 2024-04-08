package com.ohgiraffers.section03.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers")        // 이 파일에 있는 어노테이션이 ㅜ붙은 친구들을 등록해준다.
public class ContextConfiguration {

}
