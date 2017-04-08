package oop.interfaces.classes;

public class 인어 implements 사람, 물고기{
    @Override
    public void 헤엄치기() {
        사람.super.헤엄치기();
    }
}
