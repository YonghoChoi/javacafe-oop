package oop.encapsulation.classes;

public class 금호타이어 extends 타이어{
    public 금호타이어() {
        이름설정("금호타이어");  // 이름설정이라는 메소드는 접근제한자가 protected이므로 하위클래스에서 호출 가능
    }

    public String 이름() {
        return name;    // name을 사용할 수 있는 이유는 name의 접근제한자가 default이기 때문. (타이어 클래스와 같은 패키지에 존재)
    }
}
