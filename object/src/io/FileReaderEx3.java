package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx3 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader(".\\src\\io\\FileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("c:\\temp=source.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            String str = null;
            // br.readLine() : 줄 단위로 읽어오기
            int i = 1;
            while ((str = br.readLine()) != null) {
                bw.write(i + "\t" + str);
                bw.newLine(); // 엔터
                i++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
