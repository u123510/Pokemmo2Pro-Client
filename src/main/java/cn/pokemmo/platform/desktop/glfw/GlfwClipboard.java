package cn.pokemmo.platform.desktop.glfw;

import f.*;


import java.io.PrintStream;
import org.lwjgl.util.tinyfd.TinyFileDialogs;

public class GlfwClipboard extends ss_2 {

    public GlfwClipboard() {
        super();
    }

    public static boolean x20() {
        boolean res = TinyFileDialogs.tinyfd_messageBox("tinyfd_query", null, "ok", "info", false);
        if (!ea0_1.rv0 || !res) {
            return res;
        }
        String response = TinyFileDialogs.tinyfd_getGlobalChar("tinyfd_response");
        if (response == null) {
            return false;
        }
        switch (response) {
            case "gxmessage":
            case "kdialog":
            case "matedialog":
            case "shellementary":
            case "zenity":
            case "zenity3":
            case "xmessage":
            case "gdialog":
            case "yad":
            case "gmessage":
            case "qarma":
            case "xdialog":
                return true;
            default:
                return false;
        }
    }

    public static void Wz() {
        try {
            PrintStream out = System.out;
            out.println("tinyfd_version " + TinyFileDialogs.tinyfd_getGlobalChar("tinyfd_version"));
            boolean gui = x20();
            String type = gui ? "GUI" : "Console";
            out.println("tinyfd_response " + type + " " + TinyFileDialogs.tinyfd_getGlobalChar("tinyfd_response"));
            if (gui) {
                tw0_0.uV = new GlfwClipboard();
            } else {
                throw new RuntimeException("TinyFD GUI unavailable");
            }
        } catch (Exception | Error e) {
            S00.D8();
        }
    }

    @Override
    public final void Ef0(String title, String message, UE ue, Runnable runnable, boolean z) {
        String cleanTitle = title.replace('"', ' ').replace('\'', ' ');
        String cleanMessage = message.replace('"', ' ').replace('\'', ' ');
        String dialogType = "info";
        String iconType;
        switch (ct_0.vb0[ue.Jj0]) {
            case 1:
                iconType = "error";
                break;
            case 3:
                iconType = "warning";
                break;
            case 4:
                iconType = "question";
                break;
            default:
                iconType = "info";
                break;
        }
        TinyFileDialogs.tinyfd_messageBox(cleanTitle, cleanMessage, dialogType, iconType, true);
        if (runnable != null) {
            if (!z && lg_0.k != null) {
                lg_0.k.lPT5(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override
    public final void Qu(String title, String message, UE ue, Runnable onYes, Runnable onNo, boolean z) {
        String cleanTitle = title.replace('"', ' ').replace('\'', ' ');
        String cleanMessage = message.replace('"', ' ').replace('\'', ' ');
        String dialogType = "yesno";
        String iconType;
        switch (ct_0.vb0[ue.Jj0]) {
            case 1:
                iconType = "error";
                break;
            case 3:
                iconType = "warning";
                break;
            case 4:
                iconType = "question";
                break;
            default:
                iconType = "info";
                break;
        }
        boolean res = TinyFileDialogs.tinyfd_messageBox(cleanTitle, cleanMessage, dialogType, iconType, true);
        if (res) {
            if (onYes != null) {
                if (!z && lg_0.k != null) {
                    lg_0.k.lPT5(onYes);
                } else {
                    onYes.run();
                }
            }
        } else {
            if (onNo != null) {
                if (!z && lg_0.k != null) {
                    lg_0.k.lPT5(onNo);
                } else {
                    onNo.run();
                }
            }
        }
    }
}
