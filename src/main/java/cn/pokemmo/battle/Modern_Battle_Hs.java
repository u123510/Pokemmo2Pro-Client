package cn.pokemmo.battle;

import f.*;

/**
 * 现代化重构类 - 原始混淆类: f.HS
 */
public abstract class Modern_Battle_Hs {

    public Modern_Battle_Hs() {
        super();
    }

    public static String k70(int n, CH0 cH0) {
        switch (n) {
            default: {
                return "";
            }
            case 10: {
                return "tag-admin";
            }
            case 9: {
                return "tag-dev";
            }
            case 8: {
                return "tag-hgm";
            }
            case 7: {
                if (cH0.Sa == 348339L) {
                    return "tag-sm";
                }
                return "tag-sgm";
            }
            case 5: 
            case 6: {
                long l = cH0.Sa;
                if (l != 16413433L && l != 16361786L) {
                    return "tag-gm";
                }
                return "tag-gd";
            }
            case 2: 
            case 3: 
            case 4: {
                return "tag-mod";
            }
            case 1: 
        }
        return "tag-cm";
    }
}


