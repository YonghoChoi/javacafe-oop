package oop.etc.classes;

public class 동물 {
    String className;

    public 동물() {
        this.className = "동물";
    }

    public String 이름() {
        return className;
    }

    public void 이름변경(String className) {
        this.className = className;
    }
}
