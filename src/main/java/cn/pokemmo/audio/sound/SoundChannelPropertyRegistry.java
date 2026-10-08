/*
 * Decompiled with CFR 0.152.
 */
package cn.pokemmo.audio.sound;

import f.*;

import f.Cq0;
import f.dl_1;
import f.sm0_0;

/*
 * Renamed from f.Nf0
 */
public abstract class SoundChannelPropertyRegistry {
    public static final dl_1 G8 = Cq0.E1(SoundChannelPropertyRegistry.class);
    public static final int sS;
    public static final int gw;
    public static final int SL;
    public static final int Ws;
    public static final int wj;
    public static final int bu;
    public static final int Ko0;
    public static final int Cs0;
    public static final int oc;
    public static final int AI;
    public static final int lPT6;
    public static final int l1;
    public static final int go;
    public static final int i3;
    public static final int Vj0;
    public static final int vz0;
    public static final int OC;
    public static final int Y4;
    public static final int Dz0;
    public static final int sK;
    public static final int uT;
    public static final int Yt;
    public static final int BA;
    public static final int Bq0;
    public static final int EC0;
    public static final int Po;
    public static final int cs0;
    public static final int m2;
    public static final int d1;
    public static final int xp0;
    public static final int zg0;
    public static final int Cn0;
    public static final int lr0;
    public static final int bC0;
    public static final int Sc;
    public static final int Uh;
    public static final int n5;
    public static final int oa;

    static {
        sm0_0.Tm0(24, "The game server could not validate the game client.\n\nPlease restart the client and reconnect.");
        sS = 24;
        sm0_0.Tm0(26, "Could not load string file {00} because it is outdated.\nExpected string revision: {01}");
        gw = 26;
        sm0_0.Tm0(27, "Could not apply mod {00} because it defines a theme with the name {01} which is already loaded.");
        SL = 27;
        sm0_0.Tm0(28, "Could not load theme {00} because it is outdated.\nExpected theme revision: {01}");
        Ws = 28;
        sm0_0.Tm0(29, "Error loading rom data.\nOne of the loaded roms may be invalid or corrupt.");
        wj = 29;
        sm0_0.Tm0(30, "Error loading PokeMMO resources.");
        bu = 30;
        sm0_0.Tm0(31, "Could not load theme {00} because it is not a mobile theme.");
        Ko0 = 31;
        sm0_0.Tm0(32, "You were shaking your phone for 3 seconds, do you want to report an error?");
        Cs0 = 32;
        sm0_0.Tm0(33, "PokeMMO has crashed.\n\nPlease restart the application to continue.");
        sm0_0.Tm0(34, "PokeMMO requires newer functionality than your operating system provides.\nYou must upgrade your operating system to play.");
        oc = 34;
        sm0_0.Tm0(36, "Insufficient storage available.\nConsider deleting apps or content you no longer need and try again.");
        sm0_0.Tm0(37, "This platform is now unsupported and the game may break at any time in the future.");
        AI = 37;
        sm0_0.Tm0(38, "Sorry, this application cannot run on this platform.");
        lPT6 = 38;
        sm0_0.Tm0(39, "Sorry, this application cannot run under a Virtual Machine.");
        l1 = 39;
        sm0_0.Tm0(40, "Fatal Render Error");
        go = 40;
        sm0_0.Tm0(41, "Fatal render error has occurred.\n\nWould you like to submit an error report?");
        i3 = 41;
        sm0_0.Tm0(42, "Error Report #{00}\n\nPlease include this number with any support request.\n\n(Error Report Number copied to clipboard)");
        Vj0 = 42;
        sm0_0.Tm0(43, "Error submitting error report.");
        vz0 = 43;
        sm0_0.Tm0(44, "Found error log from previous session.\n\nWould you like to submit an error report?");
        OC = 44;
        sm0_0.Tm0(45, "Would you like to submit an error report?");
        Y4 = 45;
        sm0_0.Tm0(46, "Submit error report");
        Dz0 = 46;
        sm0_0.Tm0(47, "The default theme failed to load.");
        sK = 47;
        sm0_0.Tm0(50, "Yes");
        uT = 50;
        sm0_0.Tm0(51, "No");
        Yt = 51;
        sm0_0.Tm0(52, "OK");
        BA = 52;
        sm0_0.Tm0(53, "Cancel");
        Bq0 = 53;
        sm0_0.Tm0(55, "Loading...");
        EC0 = 55;
        sm0_0.Tm0(61, "None");
        Po = 61;
        sm0_0.Tm0(81, "Fatal OutOfMemoryError.\n\nPlease restart the application and try again.\n\nPlease visit https://pokemmo.com/oom for more information.");
        cs0 = 81;
        sm0_0.Tm0(85, "Error attempting to set up hardware accelerated graphics.\nPlease visit https://pokemmo.com/pfna for instructions on how to fix this.");
        m2 = 85;
        sm0_0.Tm0(86, "PokeMMO is running in compatibility mode.\nPerformance will be severely degraded.\nVisit https://pokemmo.com/swr for more information.");
        sm0_0.Tm0(88, "Sorry, Your computer does not meet the minimum requirements.");
        d1 = 88;
        sm0_0.Tm0(89, "Possible rom corruption detected.\nPlease reimport a clean rom and try again.\nIf this persists, please contact support.");
        xp0 = 89;
        sm0_0.Tm0(901, "Could not load main update feed.\nThis may be caused by a firewall restriction, incorrect proxy settings, or a server error.");
        zg0 = 901;
        sm0_0.Tm0(1145, "Theme Error");
        Cn0 = 1145;
        sm0_0.Tm0(1146, "The theme \"{00}\" could not be loaded.\nThe theme may be incompatible with the current version.\nPlease check logs for more information on the cause of the error.");
        lr0 = 1146;
        sm0_0.Tm0(1147, "The language or version of the selected {00} ROM is not currently compatible.");
        bC0 = 1147;
        sm0_0.Tm0(1171, "Do you want to attempt to repair your PokeMMO client?");
        Sc = 1171;
        sm0_0.Tm0(1216, "Error attempting to set up hardware accelerated graphics.\nWould you like to attempt to use the ANGLE rendering mode?");
        Uh = 1216;
        sm0_0.Tm0(2021, "This client is not compatible with PokeMMO servers. Please uninstall and redownload the client from https://pokemmo.com/downloads/");
        sm0_0.Tm0(2022, "This client is outdated. Please uninstall and redownload the client from https://pokemmo.com/downloads/");
        n5 = 2022;
        sm0_0.Tm0(2910, "Error report successful.");
        oa = 2910;
        sm0_0.Tm0(2911, "This issue is known and will be fixed in an upcoming update.\n\nError Report #{00}");
        sm0_0.Tm0(2912, "An issue was detected with your client.\nPlease redownload and reinstall PokeMMO from https://pokemmo.com\n\nError Report #{00}");
        sm0_0.Tm0(2913, "We are currently investigating this issue.\nThank you for your report.\n\nError Report #{00}");
        sm0_0.Tm0(2914, "There is an issue with your {01}.\nThis file may be invalid or corrupt.\nPlease try a different copy of the ROM.\n\nError Report #{00}");
        sm0_0.Tm0(2915, "There is an issue with the mod: {01}\nPlease disable this mod or install a fixed version.\n\nError Report #{00}");
        sm0_0.Tm0(2916, "This is an issue with your graphics drivers or device.\nPlease try updating your graphics drivers.\n\nError Report #{00}");
    }
}

