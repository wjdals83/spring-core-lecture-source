package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("bookDAO")
public class BookDAOImpl implements BookDAO {

    private final Map<Integer, BookDTO> bookList;       // 필드 선언

    public BookDAOImpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123, "혼공자", "서정민", "한빛출판", new Date()));
        bookList.put(2, new BookDTO(2, 6789, "혼공자2", "조평훈", "한빛출판", new Date()));
    }

    @Override
    public List<BookDTO> selectBookList() {

        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }
}
