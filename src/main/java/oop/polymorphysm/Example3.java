package oop.polymorphysm;

import oop.polymorphysm.classes.고래;
import oop.polymorphysm.classes.동물;

public class Example3 {
    /**
     * 오버라이딩(overriding)과 오버로딩(overloading)
     * @param args
     */
    public static void main(String[] args) {
        고래 whale = new 고래();
//        whale.showMe(); // 메소드 오버라이딩

        whale.showMe("흰수염고래");  // 메소드 오버로딩
        whale.showMe("범고래", 2); // 메소드 오버로딩
    }
}
