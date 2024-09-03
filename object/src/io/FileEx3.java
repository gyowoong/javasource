package io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileEx3 {
    static int totalFiles = 0;
    static int totalDirs = 0;

    public static void main(String[] args) {
        File f = new File("c:\\temp");

        if (!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        printFileList(f);
        System.out.println();
        System.out.println("총 " + totalFiles + "개의 파일");
        System.out.println("총 " + totalDirs + "개의 디렉토리");

    }

    public static void printFileList(File f) {

        System.out.println(f.getAbsolutePath() + " 디렉토리");

        // 폴더 접근 후 파일 목록 읽어오기
        File[] files = f.listFiles();

        // 디렉토리라면 List에 추가하기
        List<String> subDir = new ArrayList<>();

        // 리스트 사이즈를 구해서 totalDirs 에 추가

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();

            if (files[i].isDirectory()) {
                fileName = "[" + fileName + "]";
                subDir.add(i + "");
            }
            System.out.println(fileName);
        }

        int dirNum = subDir.size();
        int fileNum = files.length - dirNum;

        totalFiles += fileNum;
        totalDirs += dirNum;
        System.out.println(fileNum + "개의 파일, " + dirNum + "개의 디렉토리");
        System.out.println();

        for (int j = 0; j < subDir.size(); j++) {
            int index = Integer.parseInt(subDir.get(j));
            printFileList(files[index]); // 재귀호출
        }

    }

}
