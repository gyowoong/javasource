package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        // list에 Member 추가
        list.add(new Member("hong123", "홍길동", "서울", "hong@naver.com"))
        list.add(new Member("hong124", "홍길동", "서울", "hong@naver.com"))
        list.add(new Member("hong125", "홍길동", "서울", "hong@naver.com"))
        list.add(new Member("hong126", "홍길동", "서울", "hong@naver.com"))

        for (Member member : list) {
            System.out.println(member.getId() + "\t");
            System.out.println(member.getName() + "\t");
            System.out.println(member.getAddr() + "\t");
            System.out.println(member.getEmail());
        }
    }

}
