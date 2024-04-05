package com.ohgraffers.section01.autowired.subsection03.setter;

import com.ohgraffers.section01.autowired.subsection03.setter.BookService;
import com.ohgraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgraffers.section01");

    BookService bookService = context.getBean("ServiceSetter", BookService.class);

        List<BookDTO> books = bookService.selectALlBooks();
        for(BookDTO book : books) {
            System.out.println("book = " + book);
        }

        System.out.println(bookService.selectOneByBookBySequence(1));

    }

}
