package cn.pokemmo.command.admin;

import cn.pokemmo.command.console.BaseConsoleCommand;
import f.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 客户端配置项修改指令 (Set Client Config Command)
 * 语法: >setclientconfig <CONFIG_NAME> [value]
 *
 * 原混淆类: f.B80
 */
public class SetClientConfigCommand extends BaseConsoleCommand {
    public SetClientConfigCommand() {
        super("setclientconfig");
    }

    public final void Hh(String[] args) {
        String usage = ">setclientconfig <CONFIG_NAME> [value]";
        if (args.length < 2) {
            for (Field field : dw_2.class.getDeclaredFields()) {
                if (field.isAnnotationPresent(_interface.class) && !Modifier.isFinal(field.getModifiers())) {
                    boolean accessible = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        _interface meta = field.getAnnotation(_interface.class);
                        fr_2.B40(field.getType(), meta.propertyTransformer());
                        zy0_0.CF0.Xt("\u2219 " + field.getName() + " = " + field.get(null), "blue");
                    }
                    catch (Exception exception) {
                        zy0_0.CF0.Xt("Error: " + exception.getMessage(), "red");
                    }
                    finally {
                        field.setAccessible(accessible);
                    }
                }
            }
            WY.Ba0(usage);
            return;
        }

        String fieldName = args[1];
        String valueText = args.length > 2 ? args[2] : null;
        for (Field field : dw_2.class.getDeclaredFields()) {
            if (!field.isAnnotationPresent(_interface.class) || Modifier.isFinal(field.getModifiers()) || !field.getName().equals(fieldName)) {
                continue;
            }
            boolean accessible = field.isAccessible();
            field.setAccessible(true);
            try {
                _interface meta = field.getAnnotation(_interface.class);
                rx_0 transformer = fr_2.B40(field.getType(), meta.propertyTransformer());
                if (valueText == null) {
                    zy0_0.CF0.Xt(fieldName + " = " + field.get(null), "blue");
                    return;
                }
                Object value = transformer.nx0(valueText, field, meta.min(), meta.max());
                field.set(null, value);
                if (fieldName.equalsIgnoreCase("MAX_FPS") || fieldName.equalsIgnoreCase("MAX_FPS_UNFOCUSED") || fieldName.equalsIgnoreCase("RENDER_MSAA_SAMPLES")) {
                    int fps = dw_2.WH0;
                    tw0_0.lM.getClass();
                    lg_0.S4.rt0.IG0.Xs0 = fps;
                }
                zy0_0.CF0.Xt("Changed field " + fieldName + " to value " + value, "green");
            }
            catch (Exception exception) {
                zy0_0.CF0.Xt("Error changing field " + fieldName + " to value " + valueText, "red");
                WY.Ba0("Error: " + exception.getMessage());
            }
            finally {
                field.setAccessible(accessible);
            }
            return;
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
