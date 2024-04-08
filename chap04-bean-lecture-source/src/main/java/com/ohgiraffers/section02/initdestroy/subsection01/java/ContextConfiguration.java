package com.ohgiraffers.section02.initdestroy.subsection01.java;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new Date());
    }

    @Bean Product milk() {
        return new Beverage("초코우유", 2000, 500);
    }

    @Bean
    public Product water() {
        return new Beverage("에비앙", 50000, 500);
    }

    /* prototype : getBean() 시에 매번 새로운 인스턴스를 생성하게 해준다.  */
    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop", destroyMethod = "closeShop")  //최초로 동작시킬 메소드를 정의할 수 있다.
    public Owner owner() {

        return new Owner();
    }

}
