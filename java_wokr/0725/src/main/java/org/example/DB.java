package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {


    public static void main(String[] args) {

        try {
            //DB연결유지쿨래스
            Connection conn
                    = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "1234");
            System.out.println("되니");

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO student values ('박길동',100, 100,98)");

        } catch (Exception e) {


            e.printStackTrace();
        }

    }


}
