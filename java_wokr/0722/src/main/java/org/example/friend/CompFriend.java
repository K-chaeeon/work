package org.example.friend;

public class CompFriend extends Friend {
//    private String name;
//    private String phone;
    private String department;

    public CompFriend(String name, String phone, String department) {
//        this.name = name;
//        this.phone = phone;
        super(name,phone);
        this.department = department;
    }

    public void showInfo() {
//        System.out.println("이름 = " + name);
//        System.out.println("연락처 = " + phone);
        super.showInfo();
        System.out.println("부서 = " + department);
    }

    @Override
    public String toString() {
        return "CompFriend{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
