package com.ohgraffers.section01.autowired.subsection02.constructor;

import com.ohgraffers.section01.common.BookDAO;
import com.ohgraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ServiceConstructor")
public class BookService {

    /* 필기.
    *   1. 필드 주입은 의존성이 있는 객체가 생성되지 않아도 객체의 생성이 가능하다.
    *       따라서 메소드가 호출될 떄(런타임) 오류가 발생하게 된다.
    *       생성자 주입은 의존성이 있는 객체가 생성되지 않으면
    *       객체의 생성이 불가능하여 어플리케이션 실행 시점에 오류가 발생한다.
    *   2. 필드에 final 키워드를 사용할 수 있기 떄문에 객체의 생성 이후
    *       의존성을 변경할 수 없어 안정성이 보장된다.
    *   3. 코드 가독성이 좋다.
    *  */
    private final BookDAO bookDAO;

    @Autowired      // 생성자를 통한 초기화가 됐다.
    public BookService(BookDAO bookDAO) {       // @autowired가 자동으로 'BookDAO 타입의 Bean을 찾아서 주입해준다.

        this.bookDAO = bookDAO;
    }

    /* 중요. @autowired 를 입력하지 않았을 땐,
    *   public BookService() {
    *   this.bookDAO = new BookDAOImpl(); 이런식으로 써줘야 한다.
    * */

    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }

}
