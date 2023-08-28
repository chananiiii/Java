package org.example.chap_10;

public class _02_AnnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();

        System.out.println();

        // 추상 클래스를 직접 구현하면서 선언 할 수 있다.
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    private static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추, 샐러드 등등");

            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 소고기패티, 해쉬브라운, 감자, 양상주, 메요네즈, 피클");
            }
        };
    }
}

abstract class HomeMadeBurger {
    public abstract void cook();
}
