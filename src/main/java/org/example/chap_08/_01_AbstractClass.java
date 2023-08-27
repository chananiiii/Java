package org.example.chap_08;

import org.example.chap_08.camera.Camera;
import org.example.chap_08.camera.FactoryCam;
import org.example.chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstraction)
        // 몰라도 되는 부분은 숨기고 꼭 필요한 부분만 노출
        // Abstract, 추상 클래스(아직 완성되지 않은 클래스)
        // 추상 메소드(추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)
        // 추상 메소드는 추상 클래스에 있어도되고 없어도된다.

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
