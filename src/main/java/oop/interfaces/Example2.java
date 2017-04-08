package oop.interfaces;

import oop.interfaces.classes.날수있는;
import oop.interfaces.classes.박쥐;
import oop.interfaces.classes.참새;

public class Example2 {
    /**
     * 인터페이스 구현체는 해당 인터페이스로 변환 가능
     */
    public static void main(String[] args) {
        날수있는[] animals = new 날수있는[2];

        animals[0] = new 박쥐();
        animals[1] = new 참새();

        for(int i=0; i<animals.length; i++) {
            animals[i].fly();
        }
    }
}