package com.ohgraffers.section01.autowired.subsection02.constructor;

import com.ohgraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgraffers.section01");

        BookService bookService = context.getBean("ServiceConstructor", BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();
        for(BookDTO book : books) {
            System.out.println("book = " + book);
        }

        System.out.println(bookService.searchBookBySequence(1));

    }

}
