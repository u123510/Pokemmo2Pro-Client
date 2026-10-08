/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import java.io.Closeable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CloseUtil {
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException iOException) {}
    }

    public static void closeQuietly(Socket socket) {
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        }
        catch (IOException iOException) {}
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket == null) {
            return;
        }
        try {
            serverSocket.close();
        }
        catch (IOException iOException) {}
    }
}

