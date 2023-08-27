package org.example.chap_08;

import org.example.chap_08.camera.FactoryCam;
import org.example.chap_08.detector.AdvancedFireDetector;
import org.example.chap_08.detector.Detectable;
import org.example.chap_08.detector.FireDetectable;
import org.example.chap_08.reporter.NomalReporter;
import org.example.chap_08.reporter.Reportable;
import org.example.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 뼈대만 제공하는 구조
        // 단일상속(extends)
        // 인터페이스 안에서 인터페이스 메소드 앞에는 public abstract 가 생략되어 있다고 생각하면된다.

        Reportable nomalReporter = new NomalReporter();
        nomalReporter.report();


        Reportable videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println();

        Detectable fireDetector = new FireDetectable();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.detect();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.detect();
        factoryCam.setReporter(nomalReporter);
        factoryCam.report();
        factoryCam.setReporter(videoReporter);
        factoryCam.report();


    }
}
