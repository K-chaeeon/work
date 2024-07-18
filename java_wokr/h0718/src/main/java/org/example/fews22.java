package org.example;

import java.util.Scanner;

public class fews22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];


        System.out.print("입력: ");
        for(int i =0; i<a.length; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("출력");
        for(int i = 0; i<a.length;i++ ){
            System.out.print(a[i]);

            if(i<a.length-1){
                System.out.print(", ");
            }
        }



    }
}
