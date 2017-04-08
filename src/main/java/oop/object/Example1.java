package oop.object;

import oop.object.classes.자동차;

public class Example1 {
    public static void main(String[] args) {
        // 자동차라는 클래스를 통해 인스턴스를 생성하여 car라는 객체참조변수에 주소 할당.
        자동차 car = new 자동차();    // new 연산자로 인해 생성자 호출
        car.시동켜기();     // car 객체 참조 변수로 메소드 수행
    }
}
