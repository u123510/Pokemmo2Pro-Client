package f;

import cn.pokemmo.io.util.PropertiesFileUtils;
import java.io.File;
import java.util.Properties;

public abstract class jc0_2 extends PropertiesFileUtils {
    public static Properties[] h(File directory) {
        return loadDirectoryProperties(directory);
    }
}
