package org.example.chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // Generics 제네릭스
        Integer [] iArray = {1, 2, 3, 4, 5};
        Double [] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String [] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        System.out.println();
        printDoubleArray(dArray);
        System.out.println();
        printStringArray(sArray);

        System.out.println();

        printAnyArray(iArray);
        System.out.println();
        printAnyArray(dArray);
        System.out.println();
        printAnyArray(sArray);
    }

    // T: Type, T말고 다른걸로 써도 된다.
    // K : Key
    // V : Value
    // E : Element
    // <>
    // 제네릭스는 Wrapper class 를 사용해야한다.
    private static <T> void printAnyArray(T [] anyArray) {
        for (T t : anyArray) {
            System.out.print(t + " ");
        }
    }

    private static void printDoubleArray(Double [] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
    }

    private static void printIntArray(Integer [] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5
        }
    }
}
