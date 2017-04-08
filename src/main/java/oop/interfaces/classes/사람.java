package oop.interfaces.classes;

public interface 사람 {
    default void 헤엄치기() {
        System.out.println("팔 다리로 헤엄친다.");
    }
}
