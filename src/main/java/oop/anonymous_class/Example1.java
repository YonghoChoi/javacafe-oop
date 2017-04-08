package oop.anonymous_class;

import oop.interfaces.classes.날수있는;

public class Example1 {
    /**
     * 익명 클래스 사용
     */
    public static void main(String[] args) {
        날수있는 airplane = new 날수있는() {
            @Override
            public void fly() {
                System.out.println("비행기가 날아갑니다.");
            }
        };

        airplane.fly();
    }
}
