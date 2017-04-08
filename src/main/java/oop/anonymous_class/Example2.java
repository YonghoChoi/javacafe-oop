package oop.anonymous_class;

import oop.interfaces.classes.날수있는;

public class Example2 {
    /**
     * 익명 클래스를 람다로 전환
     */
    public static void main(String[] args) {
        날수있는 airplane = () -> System.out.println("비행기가 날아갑니다.");

        airplane.fly();
    }
}
