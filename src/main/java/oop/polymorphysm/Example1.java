package oop.polymorphysm;

import oop.polymorphysm.classes.고래;
import oop.polymorphysm.classes.동물;
import oop.polymorphysm.classes.박쥐;
import oop.polymorphysm.classes.포유류;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<동물> animals = Arrays.asList(new 동물(), new 포유류(), new 고래(), new 박쥐());

//        print1(animals);
        print2(animals);
//        print3(animals);
    }

    /**
     * foreach 구문 사용
     */
    public static void print1(List<동물> animals) {
        for (동물 animal : animals) {
            animal.showMe();
        }
    }

    /**
     * java8에 추가된 forEach 메소드 사용
     */
    public static void print2(List<동물> animals) {
        animals.forEach(animal -> animal.showMe());
    }

    /**
     * java8에 추가된 메소드 레퍼런스 사용
     */
    public static void print3(List<동물> animals) {
        animals.forEach(동물::showMe);
    }
}
