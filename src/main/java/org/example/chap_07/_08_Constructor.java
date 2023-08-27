package org.example.chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox("까망이", "FHD", 20000, "블랙");
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println(b1.serialNumber);

        System.out.println();

        BlackBox b2 = new BlackBox("하양이", "uhd", 300000, "하양이");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
    }
}
