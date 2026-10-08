package cn.pokemmo.ui.widget;

import f.*;
import f.org.json.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 现代化重构类 - 原始混淆类: f.S00
 */
public class Modern_Ui_S00 extends ss_2 {

    public Modern_Ui_S00() {
    }

    public static void D8() {
        tw0_0.uV = new S00();
    }

    private static int N7(UE value) {
        return value.Jj0 >= 0 && value.Jj0 < 4 ? value.Jj0 : -1;
    }

    @Override
    public final void Ef0(String title, String message, UE type, Runnable callback, boolean unused) {
        JFrame frame = new JFrame("PokeMMO");
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(frame, message, title, N7(type));
        frame.dispose();
        if (callback != null) {
            callback.run();
        }
    }

    @Override
    public final void Qu(String title, String message, UE type, Runnable accepted, Runnable rejected, boolean unused) {
        JFrame frame = new JFrame("PokeMMO");
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        int result = JOptionPane.showConfirmDialog(frame, message, title, 0, N7(type));
        if (result == 0 && accepted != null) {
            accepted.run();
        }
        if (result == 1 && rejected != null) {
            rejected.run();
        }
        frame.dispose();
    }
}

