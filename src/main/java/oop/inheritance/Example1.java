package oop.inheritance;

import oop.inheritance.classes.고래;
import oop.inheritance.classes.동물;
import oop.inheritance.classes.박쥐;
import oop.inheritance.classes.포유류;

public class Example1 {
    /**
     * 상위클래스에 구현한 필드/메소드를 하위클래스에서 사용.
     */
    public static void main(String[] args) {
        동물 animal = new 동물();
        포유류 mammal = new 포유류();
        고래 whale = new 고래();
        박쥐 bat = new 박쥐();

        animal.showMe();
        mammal.showMe();
        whale.showMe();
        bat.showMe();
    }
}
