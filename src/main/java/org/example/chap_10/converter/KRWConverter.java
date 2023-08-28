package org.example.chap_10.converter;

public class KRWConverter implements Convertable {

    // 1달러 = 1400 원
    @Override
    public void convert(int USD) {
        System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
    }
}
