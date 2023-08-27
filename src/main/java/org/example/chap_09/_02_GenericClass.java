package org.example.chap_09;

import org.example.chap_09.coffee.*;
import org.example.chap_09.user.User;
import org.example.chap_09.user.VipUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println();

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println();

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String)c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        // 개발자가 실수로 값을 잘못가져왔다.
        // 정수를 문자열로 형번환
        // c4Name = (String)c3.name;

        System.out.println();

        // <> 을 통해 Integer 를 받기를 기대하는 클래스
        Coffee <Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee <String> c6 = new Coffee<String>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println();

        CoffeeByUser <User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        // User 클래스를 상속받지 않은 클래스는 제네릭스 안에 넣으면 에러다
        // 왜냐면 <T extends User> 로 구현됐기 때문에.
        CoffeeByUser <User> c8 = new CoffeeByUser<>(new VipUser("서장훈"));
        c8.ready();

        System.out.println();
        orderCoffee("김영철");
        orderCoffee(35);

        System.out.println();

        orderCoffee("김영철", "아메리카노");
        orderCoffee(35, "latte");
    }

    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 : " + name);
    }
}
