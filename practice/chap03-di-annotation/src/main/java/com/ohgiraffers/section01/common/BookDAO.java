package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {

    // 도서 전체 목록 조회
    List<BookDTO> selectBookList();

    // 도서 번호로 도서 조회
    BookDTO selectOneBook(int sequence);

}
