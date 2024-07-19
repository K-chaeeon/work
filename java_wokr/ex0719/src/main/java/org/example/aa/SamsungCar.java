package org.example.aa;



public class SamsungCar extends Car {
    public SamsungCar() {
    }

    public SamsungCar(String name, String desc, String company) {

        super.name=name;
        super.desc=desc;
        super.company=company;
        //super말고 this로 적어도 됨
    }

    public void show() {
        System.out.println(
                name + " " + desc + " " + company
        );

    }

    @Override
    public String toString() {
        return "SamsungCar{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
