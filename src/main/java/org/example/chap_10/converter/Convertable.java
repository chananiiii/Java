package org.example.chap_10.converter;

@FunctionalInterface // 선언하게 되면 이 인터페이스는 함수형 인터페이스로 쓸거야 라는 것을 의미한다.
public interface Convertable {
    void convert(int USD);
    // void conver2();  <- 이런것 방지
}
