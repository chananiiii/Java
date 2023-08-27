package org.example.chap_09.coffee;

import org.example.chap_09.user.User;

// T 타입을 쓰건 상관없는데, 반드시 User 를 상속하는 T를 사용해야한다.
public class CoffeeByUser <T extends User> {
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
