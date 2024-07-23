package org.example.print;
import org.example.inter.Printable;


public class SamPrinter implements Printable{
    @Override
    public void print(String mydoc){
        System.out.println("삼성프린터 츨력");
        System.out.println(mydoc);

    }
}
