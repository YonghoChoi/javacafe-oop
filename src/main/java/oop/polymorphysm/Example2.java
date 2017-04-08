package oop.polymorphysm;

import oop.polymorphysm.classes.고래;
import oop.polymorphysm.classes.동물;

public class Example2 {
    public static void main(String[] args) {
        고래 whale = new 고래();
        동물 animal = whale;

        System.out.println(whale == animal);
    }
}
