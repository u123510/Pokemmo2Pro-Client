package cn.pokemmo.rom.nds.camera;

import f.fc_1;
import java.nio.ByteBuffer;

/**
 * 摄像机移动边界数据 (Camera Boundary Data)
 * <p>
 * 原始混淆类: {@code f.M90}
 */
public class CameraBoundaryData {
    public final int e90;
    public final fc_1[] r1;

    public CameraBoundaryData(short region, ByteBuffer data) {
        this.e90 = data.getInt();
        this.r1 = new fc_1[this.e90];
        for (int index = 0; index < this.e90; index++) {
            fc_1 boundary = new fc_1();
            this.r1[index] = boundary;
            data.getInt();
            data.getInt();
            boundary.Sg = data.getInt();
            boundary.G4 = data.getInt();
            boundary.V5 = data.getInt();
            boundary.LPT6 = data.getInt();
        }
        if (data.hasRemaining()) {
            System.out.println("more bytes found camera boundary file @" + region);
        }
    }
}
