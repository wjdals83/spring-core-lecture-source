package com.ohgiraffers.common;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("dao")      // component 안에 있는 Repository
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        this.memberMap = new HashMap<>();

        this.memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        this.memberMap.put(2, new MemberDTO(2, "user02", "pass02", "홍동길"));
    }

    public MemberDTO findMemberBySequence(int sequece) {

        return memberMap.get(sequece);
    }

    public boolean save(MemberDTO member) {

        int before = memberMap.size();

        memberMap.put(member.getSequence(), member);

        int after = memberMap.size();

        return after > before? true : false;

    }

}
