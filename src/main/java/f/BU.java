package f;

import com.badlogic.gdx.graphics.Texture;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Function;
import cn.pokemmo.ui.desktop.DesktopUIWindowHost;

/**
 * Shim: BU -> DesktopUIWindowHost
 * @see cn.pokemmo.ui.desktop.DesktopUIWindowHost
 */
public class BU extends DesktopUIWindowHost {
    public BU(Qy0 var1) {
        super(var1);
        T50 = this;
    }
}
