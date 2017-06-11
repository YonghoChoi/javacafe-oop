package oop.polymorphysm.classes;

import java.io.IOException;

public class 동물 {
    String className;

    public 동물() {
        this.className = "동물";
    }

    public void showMe() {
        System.out.println(className);
    }
}
