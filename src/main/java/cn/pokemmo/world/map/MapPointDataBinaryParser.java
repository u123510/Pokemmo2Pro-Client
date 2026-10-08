package cn.pokemmo.world.map;

import f.*;
import java.nio.ByteBuffer;

public class MapPointDataBinaryParser {
    public static final dl_1 CH;
    public final ByteBuffer DO;
    public final Q90[] yz;
    public final _package[] lE0;
    public final wa_0[] I5;
    public final YF0[] YU;

    public MapPointDataBinaryParser(Ae source) {
        super();
        ByteBuffer buffer = source.j90();
        this.DO = buffer;
        if (buffer.getInt() != 347218) {
            CH.info("{} Not a valid pointdata file.", source.k9);
            this.yz = new Q90[0];
            this.lE0 = new _package[0];
            this.I5 = new wa_0[0];
            this.YU = new YF0[0];
            return;
        }
        buffer.getInt();
        int headerValue = buffer.getInt();
        int sectionValue = buffer.getInt();
        int pointStart = buffer.getInt();
        int textureStart = buffer.getInt();
        buffer.getInt();
        buffer.getInt();
        buffer.position(headerValue);
        int pointCount = (sectionValue - headerValue) / 112;
        this.yz = new Q90[pointCount];
        for (int i = 0; i < pointCount; i++) {
            this.yz[i] = new Q90(i, buffer);
        }
        int packageCount = (pointStart - sectionValue) / 72;
        if (packageCount > 127) {
            throw new RuntimeException();
        }
        this.lE0 = new _package[packageCount];
        buffer.position(sectionValue);
        for (byte i = 0; i < packageCount; i++) {
            this.lE0[i] = new _package(i, buffer);
        }
        int waCount = (textureStart - pointStart) / 36;
        this.I5 = new wa_0[waCount];
        buffer.position(pointStart);
        for (int i = 0; i < waCount; i++) {
            this.I5[i] = new wa_0(buffer);
        }
        this.YU = new YF0[packageCount];
        buffer.position(textureStart);
        for (byte i = 0; i < packageCount; i++) {
            this.YU[i] = new YF0(buffer);
        }
    }

    public static short Hm0(byte type, short code) {
        if (type != 2) {
            return -1;
        }
        switch (code) {
            case 28: return 5;
            case 30: return 6;
            case 36: return 0;
            case 66: return 1;
            case 114: return 2;
            case 121: return 3;
            case 137: return 4;
            case 209: return 7;
            case 211: return 8;
            case 214: return 9;
            case 241:
            case 242:
            case 243:
            case 244: return 10;
            case 249: return 11;
            case 255: return 12;
            case 338: return 13;
            case 339: return 14;
            case 340: return 15;
            case 341: return 16;
            default: return -1;
        }
    }

    static {
        CH = Cq0.E1(MapPointDataBinaryParser.class);
    }
}
