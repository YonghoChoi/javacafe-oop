package oop.object.classes;

public class 자동차 {
    String name;

    public 자동차() {
        System.out.println("자동차 클래스의 생성자 입니다.");
    }

    public 자동차(String name) {
        this.name = name;
        System.out.println("이름이 " + name + "인 자동차 클래스의 생성자 입니다.");
    }

    public void 시동켜기() {
        System.out.println("시동을 켰습니다. 부릉부릉");
    }

    public String 자동차이름() {
        return name;
    }
}
