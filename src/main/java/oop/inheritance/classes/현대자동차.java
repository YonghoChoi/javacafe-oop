package oop.inheritance.classes;

public class 현대자동차 extends 자동차{
    @Override
    public void 시동켜기() {
        System.out.println("현대 자동차는 키로 시동 켬");
    }

    @Override
    public void 시동끄기() {
        System.out.println("현대 자동차는 키로 시동 끔");
    }
}
