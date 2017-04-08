package oop.polymorphysm.classes;

public class 고래 extends 포유류 {
    public 고래() {
        this.className = "고래";
    }

    @Override
    public void showMe() {
        System.out.println("저의 이름은 " + this.className + "입니다.");
    }

    public void showMe(String name) {
        this.className = name;
        super.showMe();
    }

    public void showMe(String name, int count) {
        this.className = name;
        for (int i = 0; i < count; i++) {
            super.showMe();
        }
    }
}
