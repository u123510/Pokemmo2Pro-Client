package ch.qos.logback.core.testUtil;
import java.util.Random;
public class RandomUtil {
    private static Random random = new Random();
    public RandomUtil() {}
    public static int getRandomServerPort() { return random.nextInt(20000) + 1024; }
    public static int getPositiveInt() { int value = random.nextInt(); return value < 0 ? -value : value; }
}
