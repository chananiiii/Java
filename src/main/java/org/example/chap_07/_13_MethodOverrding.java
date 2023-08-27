package org.example.chap_07;

import org.example.chap_07.camera.Camera;
import org.example.chap_07.camera.FactoryCam;
import org.example.chap_07.camera.SpeedCam;

public class _13_MethodOverrding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }

}
