package org.example.chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지(랜덤 클래스)
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt()); // int 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 : " + random.nextInt(10)); // 0 이상 10 미만의 정수형 값 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 값
        System.out.println("랜덤 실수 (범위) : " + (5 + (10 - 5) * random.nextDouble())); // 5 이상 10.0 미만의 실수 값
        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면 ? 1 ~ 45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));

        // Math. Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDataTime, DateTimeFormatter, ......
    }
}
