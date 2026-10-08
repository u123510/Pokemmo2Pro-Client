package cn.pokemmo.command.console;

import f.*;
import java.util.*;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class SetConfigConsoleCommand extends BaseConsoleCommand {


    public SetConfigConsoleCommand() {
        super("setconfig");
    }


    public void Hh(String[] v1) {
        String msg = "用法: >setconfig <配置项名称> [配置值]";
        if (v1.length < 2) {
            Field[] fields = lpt3__1.class.getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(_interface.class) && !Modifier.isFinal(field.getModifiers())) {
                    _interface anno = field.getAnnotation(_interface.class);
                    fr_2.B40(field.getType(), anno.propertyTransformer());
                    boolean acc = field.isAccessible();
                    field.setAccessible(true);
                    try {
                        Object val = field.get(new Object());
                        zy0_0.CF0.Xt("∙ " + field.getName() + " = " + val, "blue");
                    } catch (Exception ex) {
                        zy0_0.CF0.Xt("错误: " + ex.getMessage(), "red");
                    }
                    field.setAccessible(acc);
                }
            }
            WY.Ba0(msg);
            return;
        }

        String targetName = v1[1];
        String targetVal = null;
        if (v1.length > 2) {
            targetVal = v1[2];
        }

        Field[] fields = lpt3__1.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(_interface.class) && !Modifier.isFinal(field.getModifiers()) && field.getName().equals(targetName)) {
                _interface anno = field.getAnnotation(_interface.class);
                rx_0 transformer = fr_2.B40(field.getType(), anno.propertyTransformer());
                boolean acc = field.isAccessible();
                field.setAccessible(true);
                if (targetVal == null) {
                    try {
                        Object val = field.get(new Object());
                        zy0_0.CF0.Xt(targetName + " = " + val, "blue");
                        return;
                    } catch (Exception ex) {
                        zy0_0.CF0.Xt("修改配置项失败: " + targetName + " 为目标值: " + targetVal, "red");
                        WY.Ba0("错误: " + ex.getMessage());
                        field.setAccessible(acc);
                        return;
                    }
                } else {
                    try {
                        String min = anno.min();
                        String max = anno.max();
                        Object parsed = transformer.nx0(targetVal, field, min, max);
                        field.set(null, parsed);
                        zy0_0.CF0.Xt("已成功将配置项 " + targetName + " 为目标值: " + parsed, "green");
                    } catch (Exception ex) {
                        zy0_0.CF0.Xt("修改配置项失败: " + targetName + " 为目标值: " + targetVal, "red");
                        WY.Ba0("错误: " + ex.getMessage());
                    }
                    field.setAccessible(acc);
                    return;
                }
            }
        }
    }

    @Override
    public void execute(String[] args) {
        this.Hh(args);
    }
}
