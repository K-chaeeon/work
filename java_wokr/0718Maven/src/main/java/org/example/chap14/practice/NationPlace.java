package org.example.chap14.practice;


public class NationPlace extends Name {
    private String nat;
    private String place;


    public NationPlace(String nat, String place) {
        this.nat = nat;
        this.place = place;

    }

    public void showWhen() {

        System.out.println(" / " + "출신 = " + nat + " / 지역 = " + place);

    }

}
