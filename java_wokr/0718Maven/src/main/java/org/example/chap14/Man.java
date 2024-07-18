package org.example.chap14;

public class Man {

    private String name;

/*
    public Man(){}      //(@@@@@@@@)
이렇게 기본생성자 호출하면 %%%%%% 안 적어도 됨
*/

    public Man(String name) {       //(&&&&&&&&)
        this.name = name;

    }

    public void tellInfo() {
        System.out.println("name = " + name);
    }

}

