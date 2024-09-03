package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialEx1 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", "엔지니어", "hong@gmail.com");
        Person p2 = new Person("성춘향", "교사", "sung@gmail.com");

        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\person.dat");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos)) {

            // java.io.NotSerializableException: io.Person
            oos.writeObject(p1);
            oos.writeObject(p2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
