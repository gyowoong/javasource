package api;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();

        list.add(new Member("hong123", "홍길동"));
        list.add(new Member("hong124", "김길동"));
        list.add(new Member("hong125", "최길동"));
        list.add(new Member("hong126", "이길동"));

        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.remove(2));

        System.out.println(list);

        for (Member member : list) {
            String id = member.getId();
            String name = member.getName();
        }

    }

}
