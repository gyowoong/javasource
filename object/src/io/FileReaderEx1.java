package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx1 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("c:\\temp\\file1.txt", Charset.forName("Utf-8"));
                FileWriter fw = new FileWriter("c:\\temp\\output2.txt")) {

            int data = 0;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);

                fw.write(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
