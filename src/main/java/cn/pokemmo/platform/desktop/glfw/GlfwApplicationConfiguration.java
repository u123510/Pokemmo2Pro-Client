/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.platform.desktop.glfw;

import f.*;


import f.Yo0;
import f.el0_0;
import org.lwjgl.glfw.GLFW;

public class GlfwApplicationConfiguration
extends Yo0 {
    public GlfwApplicationConfiguration() {
        super(0);
        el0_0.Pa();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final String oO(int n, String string) {
        String string2;
        if (n <= 0) {
            return string;
        }
        int n2 = switch (n) {
            default -> 0;
            case 194 -> 313;
            case 193 -> 312;
            case 192 -> 311;
            case 191 -> 310;
            case 190 -> 309;
            case 189 -> 308;
            case 188 -> 307;
            case 187 -> 306;
            case 186 -> 305;
            case 185 -> 304;
            case 184 -> 303;
            case 183 -> 302;
            case 161 -> 336;
            case 160 -> 335;
            case 158 -> 330;
            case 157 -> 334;
            case 156 -> 333;
            case 155 -> 332;
            case 154 -> 331;
            case 153 -> 329;
            case 152 -> 328;
            case 151 -> 327;
            case 150 -> 326;
            case 149 -> 325;
            case 148 -> 324;
            case 147 -> 323;
            case 146 -> 322;
            case 145 -> 321;
            case 144 -> 320;
            case 143 -> 282;
            case 142 -> 301;
            case 141 -> 300;
            case 140 -> 299;
            case 139 -> 298;
            case 138 -> 297;
            case 137 -> 296;
            case 136 -> 295;
            case 135 -> 294;
            case 134 -> 293;
            case 133 -> 292;
            case 132 -> 291;
            case 131 -> 290;
            case 130 -> 345;
            case 129 -> 341;
            case 124 -> 260;
            case 123 -> 269;
            case 121 -> 284;
            case 120 -> 283;
            case 116 -> 281;
            case 115 -> 280;
            case 112 -> 261;
            case 111 -> 256;
            case 93 -> 267;
            case 92 -> 266;
            case 82 -> 348;
            case 75 -> 39;
            case 74 -> 59;
            case 73 -> 92;
            case 72 -> 93;
            case 71 -> 91;
            case 70 -> 61;
            case 68 -> 96;
            case 67 -> 259;
            case 66 -> 257;
            case 63 -> 343;
            case 62 -> 32;
            case 61 -> 258;
            case 60 -> 344;
            case 59 -> 340;
            case 58 -> 346;
            case 57 -> 342;
            case 56 -> 46;
            case 55 -> 44;
            case 54 -> 90;
            case 53 -> 89;
            case 52 -> 88;
            case 51 -> 87;
            case 50 -> 86;
            case 49 -> 85;
            case 48 -> 84;
            case 47 -> 83;
            case 46 -> 82;
            case 45 -> 81;
            case 44 -> 80;
            case 43 -> 79;
            case 42 -> 78;
            case 41 -> 77;
            case 40 -> 76;
            case 39 -> 75;
            case 38 -> 74;
            case 37 -> 73;
            case 36 -> 72;
            case 35 -> 71;
            case 34 -> 70;
            case 33 -> 69;
            case 32 -> 68;
            case 31 -> 67;
            case 30 -> 66;
            case 29 -> 65;
            case 22 -> 262;
            case 21 -> 263;
            case 20 -> 264;
            case 19 -> 265;
            case 16 -> 57;
            case 15 -> 56;
            case 14 -> 55;
            case 13 -> 54;
            case 12 -> 53;
            case 11 -> 52;
            case 10 -> 51;
            case 9 -> 50;
            case 8 -> 49;
            case 7 -> 48;
            case 3 -> 268;
        };
        if (n2 > 0 && (string2 = GLFW.glfwGetKeyName(n2, 0)) != null) {
            if (string2.length() == 1) {
                return string2.toUpperCase();
            }
            return string2;
        }
        return super.oO(n, string);
    }
}

