package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import com.sun.source.tree.MemberReferenceTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Member;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account account() {

        return  new PersonalAccount(10, "123-12345-123123123");
    }

    @Bean
    public MemberDTO member() {

        /* 생성자를 통한 주입 */
//        return new MemberDTO(1, "서정민", "010-5518-2290", "email", account());

        /* setter 주입 */
        MemberDTO member = new MemberDTO();
        member.setSequence(1);
        member.setName("서정민");
        member.setPhone("010-8942-4476");
        member.setEmail("tjwjdals0803@naver.com");
        member.setPersonalAccount(account());

        return member;

    }

}
