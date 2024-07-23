package org.example.circle;

class Circle {
    private double rad = 0;
    final double PI = 3.14;

    public Circle(double r) {
        setRad(r);
    }

    public void setRad(double r) {  //논리적 오류를 막아주는 메소드
        if(r<0){
            rad = 0;
            return;
        }
        rad = r;
    }
    public double getArea(){
        return (rad * rad) *PI;
    }


}

