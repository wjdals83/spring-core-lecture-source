package com.ohgraffers.section02.annotation.subsection03.collection;

import com.ohgraffers.section02.annotation.subsection02.qualifier.AnimalService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgraffers.section02");

        String[] beanNames = context.getBeanDefinitionNames();
        for(String bean : beanNames) {
            System.out.println(bean);
        }

        AnimalService animalService = context.getBean("animalCollection", AnimalService.class);

        animalService.animalEat();
    }

}
