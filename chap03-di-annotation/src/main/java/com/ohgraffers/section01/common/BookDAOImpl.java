package com.ohgraffers.section01.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Component      // 객체로 쓰기 위해 Component. Data access object DAO
/* @Component 의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용 */
@Repository("bookDAO")
public class BookDAOImpl implements BookDAO{

    private final Map<Integer, BookDTO> bookList;     // 필드로 맵 선언

    public BookDAOImpl(){
        bookList = new HashMap<>();     // final 키ㅜ어드 친구라 ㅅ바로 생성자로 초기화설정해주기
        bookList.put(1, new BookDTO(1, 12345, "혼공자", "조평훈", "한빛출판", new Date()));
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
