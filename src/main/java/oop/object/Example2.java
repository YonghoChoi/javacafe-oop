package oop.object;

import oop.object.classes.자동차;

public class Example2 {
    public static void main(String[] args) {
        자동차 car = new 자동차("자바");    // 생성자에 인자 전달.
        String carName = car.자동차이름();       // 자동차이름 메소드를 실행하여 값 반환
        System.out.println("자동차 이름은? " + carName);
    }
}
