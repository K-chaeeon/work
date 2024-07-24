package org.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.newBufferedWriter;

public class Ex04 {

    public static void md1() throws IOException {
        Path file = Paths.get("d:\\simples.txt");
        BufferedWriter writer = null;

        //IOExeption이 발생하기 때문에 try catch로 하라고 뜸

        writer = newBufferedWriter(file);
        writer.write('A');
        writer.write("문자열도 적어봅니다");

        if (writer != null) ;
        writer.close();
    }

    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            System.out.println("파일만들기실패");
//            e.printStackTrace;
        }


    }

}
