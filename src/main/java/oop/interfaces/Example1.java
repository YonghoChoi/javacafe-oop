package oop.interfaces;

import oop.interfaces.classes.날수있는;
import oop.interfaces.classes.박쥐;
import oop.interfaces.classes.참새;

public class Example1 {
    /**
     * 인터페이스 구현
     */
    public static void main(String[] args) {
        날수있는 canFly1 = new 박쥐();
        canFly1.fly();

        날수있는 canFly2 = new 참새();
        canFly2.fly();
    }
}
