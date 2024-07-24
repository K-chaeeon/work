package org.example;

class Board{}
class PBoard extends Board{}

public class Ex03 {

    public static void main(String[] args) {
        //실행중에러
        Board board = new PBoard();
//        PBoard pBoard = (PBoard) new Board();   //부모객체를 형변환해서 자식개체에 담을 수 없음


        System.out.println("종료");
    }
}
