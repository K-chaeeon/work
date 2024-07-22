package org.example.friend;

public class UniFriend extends Friend {
//    private String name;
//    private String phone;
    private String major;

    public UniFriend(String name, String phone, String major) {
//        this.name = name;
//        this.phone = phone;
        super(name,phone);
        this.major = major;
    }

    public void showInfo() {
//        System.out.println("이름 = " + name);
//        System.out.println("연락처 = " + phone);
        super.showInfo();
        System.out.println("전공 = " + major);
    }

    @Override
    public String toString() {
        return "UniFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
