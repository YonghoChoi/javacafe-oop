package oop.etc;

/**
 * static 필드의 초기화
 */
public class Example2 {
    static int num1 = 1;
    static int num2 = 2;
    static int num3;

    static {
        num3 = num1 + num2;
    }

    public Example2() {
        System.out.println("생성자 호출");
    }

    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
