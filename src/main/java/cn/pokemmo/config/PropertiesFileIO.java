package cn.pokemmo.config;

import f.*;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Properties;

/**
 * 客户端配置属性文件序列化读写器 (Properties File IO)
 * 遍历类与父类中标记了 @_interface / @ConfigField 的配置字段并保存至本地 .properties 文件。
 *
 * 原混淆类: f.s8_0
 */
public abstract class PropertiesFileIO {
    public static final dl_1 eC0 = Cq0.E1(PropertiesFileIO.class);

    public static boolean j50(String fileName, Class clazz) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            Properties properties = new Properties();
            v20(clazz, null, properties);
            StringWriter sw = new StringWriter();
            try {
                properties.store(sw, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            osw.write(sw.toString());
            osw.close();
            fos.close();
            return true;
        } catch (Exception e) {
            eC0.error("Error saving config file '{}'", fileName, e);
            return false;
        }
    }

    public static void v20(Class clazz, Object obj, Properties properties) {
        Field[] fields = clazz.getDeclaredFields();
        int len = fields.length;
        for (int i = 0; i < len; i++) {
            Field field = fields[i];
            if (Modifier.isStatic(field.getModifiers())) {
                if (obj != null) {
                    continue;
                }
            } else if (obj == null) {
                continue;
            }

            if (!field.isAnnotationPresent(_interface.class)) {
                continue;
            }

            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            try {
                _interface annotation = field.getAnnotation(_interface.class);
                properties.setProperty(annotation.key(), field.get(obj).toString());
                field.setAccessible(accessible);
            } catch (Exception e) {
                RuntimeException re = new RuntimeException("Can't read field " + field.getName() + " of class " + field.getDeclaringClass(), e);
                eC0.error("", (Throwable) re);
                throw re;
            }
        }

        if (obj == null) {
            Class[] interfaces = clazz.getInterfaces();
            int ifaceLen = interfaces.length;
            for (int i = 0; i < ifaceLen; i++) {
                v20(interfaces[i], null, properties);
            }
        }

        Class superClass = clazz.getSuperclass();
        if (superClass != null && superClass != Object.class) {
            v20(superClass, obj, properties);
        }
    }

    }
