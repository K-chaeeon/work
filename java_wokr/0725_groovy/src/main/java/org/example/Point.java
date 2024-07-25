package org.example;

public class Point implements Cloneable {
    private int xpos;
    private int ypos;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//cloneable 인터페이스를 재정의해서 Clone메서드를 사용하면 객체생성 따로 안 해도 객체복사가 일어난다


    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }


    public void showPoint() {
        System.out.printf("[%d,%d]\n", xpos, ypos);
    }

    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }


}
