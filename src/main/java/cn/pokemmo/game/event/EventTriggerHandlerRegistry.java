package cn.pokemmo.game.event;

import f.*;
import java.util.EnumMap;

public abstract class EventTriggerHandlerRegistry {
    public static final EnumMap I2;

    static {
        EnumMap map = new EnumMap(i40_0.class);
        i40_0[] values = i40_0.for$;
        for (int index = 0; index < values.length; index++) {
            i40_0 key = values[index];
            gn_0 color = gn_0.WHITE;
            switch (key.ordinal()) {
                case 0:
                    color = new gn_0((byte) -24, (byte) -49, (byte) -124, (byte) -1);
                    break;
                case 1:
                    color = new gn_0(-554912);
                    break;
                case 3:
                    color = new gn_0((byte) -46, (byte) -119, (byte) -45, (byte) -1);
                    break;
                case 4:
                    color = new gn_0(-1398141);
                    break;
                case 5:
                    color = new gn_0(-3884411);
                    break;
                case 6:
                    color = new gn_0(-5516419);
                    break;
                case 7:
                    color = new gn_0(-5659169);
                    break;
                case 10:
                    color = new gn_0((byte) -1, (byte) 126, (byte) 126, (byte) -1);
                    break;
                case 11:
                    color = new gn_0((byte) 0, (byte) -52, (byte) -1, (byte) -1);
                    break;
                case 12:
                    color = new gn_0((byte) 126, (byte) -1, (byte) -106, (byte) -1);
                    break;
                case 13:
                    color = new gn_0((byte) -1, (byte) -12, (byte) 126, (byte) -1);
                    break;
                case 14:
                    color = new gn_0(-5928280);
                    break;
                case 15:
                    color = new gn_0((byte) -80, (byte) -66, (byte) -60, (byte) -1);
                    break;
                case 16:
                    color = new gn_0(-10259268);
                    break;
                case 17:
                    color = new gn_0(-12369050);
                    break;
                default:
                    break;
            }
            map.put(key, color);
        }
        I2 = map;
    }
}
