package org.example.chap_07;

import org.example.chap_07.camera.FactoryCam;
import org.example.chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println();
        speedCam.takePicture();
    }
}
