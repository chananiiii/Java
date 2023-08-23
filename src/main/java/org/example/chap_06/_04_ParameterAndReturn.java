package org.example.chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        return number * number;
    }

    public static int powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        System.out.println(getPower(2)); // 4

        int result = getPower(3);
        System.out.println(result); // 9

        System.out.println(powerByExp(3,3)); // 27
    }
}
