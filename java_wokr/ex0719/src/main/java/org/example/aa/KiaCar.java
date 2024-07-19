package org.example.aa;



public class KiaCar extends Car {
    public KiaCar(){}

    public KiaCar(String name, String desc, String company) {

    }

    public void show() {
        System.out.println(
                name + " " + desc + " " + company
        );

    }

    @Override
    public String toString() {
        return "KiaCar{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
