package org.example.chap_10;

import org.example.chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        // 함수형 인터페이스
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);

        convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"), 2);
        Convertable convertable = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertable, 1);

        System.out.println();

        // 전달값이 하나도 없다면?
        ConvertableWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();

        // 전달 값이 2개인 경우?
        ConvertableWithTwoParams c2 = (d, w) -> {
            System.out.println(d + " 달러 = " + (d * w) + " 원");
        };
        c2.convert(10, 1400);

        // 반환 값이 있는 경우?
        ConvertableWithReturn c3 = (d, w) -> {return d * w;};
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}
