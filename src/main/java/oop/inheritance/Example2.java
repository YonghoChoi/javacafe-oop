package oop.inheritance;

import oop.inheritance.classes.고래;
import oop.inheritance.classes.동물;
import oop.inheritance.classes.박쥐;
import oop.inheritance.classes.포유류;

public class Example2 {
    /**
     * 하위 클래스는 상위 클래스로 변환 가능
     */
    public static void main(String[] args) {
        동물[] animals = new 동물[4];

        animals[0] = new 동물();
        animals[1] = new 포유류();
        animals[2] = new 고래();
        animals[3] = new 박쥐();

        for(int i = 0; i < animals.length; i++) {
            animals[i].showMe();
        }
    }
}
