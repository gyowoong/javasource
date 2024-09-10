package member;

import java.util.ArrayList;
import java.util.List;

public class MemberEx1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        for (Member member : list) {
            System.out.println(member.getId());
        }
    }

}
