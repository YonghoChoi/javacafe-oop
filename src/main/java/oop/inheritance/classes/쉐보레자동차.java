package oop.inheritance.classes;

public class 쉐보레자동차 extends 자동차{
    @Override
    public void 시동켜기() {
        System.out.println("쉐보레 자동차는 버튼으로 시동 켬");
    }

    @Override
    public void 시동끄기() {
        System.out.println("쉐보레 자동차는 버튼으로 시동 끔");
    }
}
