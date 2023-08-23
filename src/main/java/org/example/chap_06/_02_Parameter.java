package org.example.chap_06;

public class _02_Parameter {
    public static void power(int number) { // Parameter, 매개변수
        System.out.println(number + " * " + number + " = " + (number * number));
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for(int i=0; i<exponent; i++) {
            result *= number;
        }
        System.out.println(number + " ^ " + exponent + " = " + (result));
    }
    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        power(2);
        power(4);
        powerByExp(2,4);
        powerByExp(3,3);
    }
}
