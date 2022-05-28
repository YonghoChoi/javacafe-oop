package oop.etc;

import oop.etc.classes.동물;

public class Example1 {
    /**
     * Call by value/reference
     */
    public static void main(String[] args) {
        int num = 100;
        System.out.println("연산하기 전 num1 값 : " + num);
        calc(num);
        System.out.println("연산 후 num1 값 : " + num);

        동물 animal = new 동물();
        System.out.println("이름 변경 전 동물 이름 : " + animal.이름());
        이름변경(animal);
        System.out.println("이름 변경 후 동물 이름 : " + animal.이름());

    }

    private static void 이름변경(동물 animal) {
        animal.이름변경("고래");
    }

    static void calc(int num) {
        num *= 2;
    }

    static void calc(Integer num) {
        num *= 2;
    }
}
