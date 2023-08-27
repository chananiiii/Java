package org.example.chap_07;

import org.example.chap_07.camera.ActionCam;
import org.example.chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final

        // public (final) class ..
        // public (final) void ...
        // public > abstract > static > final > ...

        // 상수에 넣으면 수정 불가능 하다고 전에 배웠었다.
        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "포준렌즈"; // final로 선언된 변수는 어디에서도 바꿀 수 없다.
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
    }
}
