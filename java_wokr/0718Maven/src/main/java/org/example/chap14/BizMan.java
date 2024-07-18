package org.example.chap14;

public class BizMan extends Man{

    private String company;
    private String position;



    public BizMan(String name, String company, String position) {
        super(name);           //%%%%%%%%%%%%%%
        //상속받으면 부모클래스에 있는 생성자 무조건 호출해야함
        this.company = company;
        this.position = position;

    }

    public void showInfo() {
        System.out.println("company = "+company);
        System.out.println("position = "+position);

        tellInfo();

    }

}
