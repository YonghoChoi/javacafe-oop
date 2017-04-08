package oop.inheritance;

import oop.inheritance.classes.쉐보레자동차;
import oop.inheritance.classes.자동차;
import oop.inheritance.classes.현대자동차;

public class Example3 {
    /**
     * 추상 클래스 사용
     */
    public static void main(String[] args) {
        자동차 chevrolet = new 쉐보레자동차();
        자동차 hyundai = new 현대자동차();

        chevrolet.시동켜기();
        chevrolet.시동끄기();
        chevrolet.기어변경(1);

        hyundai.시동켜기();
        hyundai.시동끄기();
        hyundai.기어변경(2);
    }
}
