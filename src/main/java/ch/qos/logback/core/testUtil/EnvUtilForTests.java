package ch.qos.logback.core.testUtil;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class EnvUtilForTests {
    static String GITHUB_HOME = "/home/runner";
    static String LOCAL_REPOSITORY_PREFIX = "/home/runner";
    public EnvUtilForTests() {}
    public static boolean isGithubAction() { String local = System.getProperty("localRepository"); return GITHUB_HOME.equals(System.getProperty("user.home")) || local != null && local.startsWith(LOCAL_REPOSITORY_PREFIX); }
    public static boolean isWindows() { return System.getProperty("os.name").indexOf("Windows") != -1; }
    public static boolean isMac() { return System.getProperty("os.name").indexOf("Mac") != -1; }
    public static boolean isLinux() { return System.getProperty("os.name").indexOf("Linux") != -1; }
    public static boolean isRunningOnSlowJenkins() { return System.getProperty("slowJenkins") != null; }
    public static String getLocalHostName() { try { return InetAddress.getLocalHost().getHostName(); } catch (UnknownHostException e) { return null; } }
    public static boolean isLocalHostNameInList(String[] names) { String host=getLocalHostName(); if(host==null)return false; for(String n:names) if(n.equalsIgnoreCase(host)) return true; return false; }
    public static String getPathToBash() { if(isLinux()) return "bash"; return isLocalHostNameInList(new String[]{"hetz","het"}) ? "c:/cygwin/bin/bash" : null; }
}
