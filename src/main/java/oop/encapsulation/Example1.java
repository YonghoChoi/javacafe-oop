package oop.encapsulation;

import oop.encapsulation.classes.금호타이어;
import oop.encapsulation.classes.타이어;

public class Example1 {
    public static void main(String[] args) {
        타이어 tire = new 타이어();
//        tire.이름설정("타이어");

        금호타이어 kumhoTire = new 금호타이어();
        String name = kumhoTire.이름();   // 이름 메소드는 접근제한자가 public이므로 외부에서 호출 가능.
        System.out.println(name);
    }
}
