package oop.inheritance.classes;

public abstract class 자동차 {
    String name;

    public abstract void 시동켜기();
    public abstract void 시동끄기();

    public void 기어변경(int shift) {
        System.out.println("기어 " + shift + "단으로 변경");
    }
}
