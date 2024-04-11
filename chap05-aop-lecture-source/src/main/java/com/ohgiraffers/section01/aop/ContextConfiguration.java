package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Bean 으로 설정할 파일들을 contextConfiguration 으로 만들었음.
@Configuration
@ComponentScan("com.ohgiraffers.section01.aop")     // 여기에 있는 빈들을 알아서 찾아줄 것.
@EnableAspectJAutoProxy(proxyTargetClass = true)        // 코드를 대신 주입해주는 친구를 만듦. aspect 와 ioc, service  있을 때 가운ㅇ데에서 가로채는 역할이 프록시. Ioc 컨테이너의 상위가 proxy 이다.
public class ContextConfiguration {
}
