package org.example.chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
