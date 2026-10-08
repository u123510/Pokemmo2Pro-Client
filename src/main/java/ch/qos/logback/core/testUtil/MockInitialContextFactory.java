package ch.qos.logback.core.testUtil;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
public class MockInitialContextFactory implements InitialContextFactory {
    static MockInitialContext mic;
    public MockInitialContextFactory() {}
    public static void initialize() { try { mic = new MockInitialContext(); } catch (NamingException e) { e.printStackTrace(); } }
    public static MockInitialContext getContext() { return mic; }
    static { System.out.println("MockInitialContextFactory static called"); initialize(); }
    public Context getInitialContext(Hashtable<?, ?> environment) { return mic; }
}
