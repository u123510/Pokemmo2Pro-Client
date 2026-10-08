package ch.qos.logback.core.joran.conditional;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyContainer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.janino.ClassBodyEvaluator;

public class PropertyEvalScriptBuilder extends ContextAwareBase {
    private static String SCRIPT_PREFIX = "public boolean evaluate() { return ";
    private static String SCRIPT_SUFFIX = "; }";
    final PropertyContainer localPropContainer;
    Map map;

    public PropertyEvalScriptBuilder(PropertyContainer localPropContainer) {
        this.map = new HashMap();
        this.localPropContainer = localPropContainer;
    }

    public Condition build(String script) throws Exception {
        ClassBodyEvaluator evaluator = new ClassBodyEvaluator();
        evaluator.setImplementedInterfaces(new Class[] { Condition.class });
        evaluator.setExtendedClass(PropertyWrapperForScripts.class);
        evaluator.setParentClassLoader(ClassBodyEvaluator.class.getClassLoader());
        evaluator.cook(SCRIPT_PREFIX + script + SCRIPT_SUFFIX);
        Class<?> clazz = evaluator.getClazz();
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Condition condition = (Condition) constructor.newInstance();
        Class<?>[] parameterTypes = new Class[] { PropertyContainer.class, PropertyContainer.class };
        Method method = clazz.getMethod("setPropertyContainers", parameterTypes);
        method.invoke(condition, localPropContainer, this.context);
        return condition;
    }
}
