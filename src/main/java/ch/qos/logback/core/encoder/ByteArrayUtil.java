package ch.qos.logback.core.encoder;

import java.io.ByteArrayOutputStream;

public class ByteArrayUtil {
    public ByteArrayUtil() {
    }

    public static void writeInt(byte[] destination, int offset, int value) {
        for (int i = 0; i < 4; i++) {
            int shift = 24 - i * 8;
            destination[offset + i] = (byte) (value >>> shift);
        }
    }

    public static void writeInt(ByteArrayOutputStream output, int value) {
        for (int i = 0; i < 4; i++) output.write(value >>> (24 - i * 8));
    }

    public static int readInt(byte[] source, int offset) {
        int result = 0;
        for (int i = 0; i < 4; i++) result += (source[offset + i] & 0xFF) << (24 - i * 8);
        return result;
    }

    public static String toHexString(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte value : bytes) {
            String hex = Integer.toHexString(value & 0xFF);
            if (hex.length() == 1) builder.append('0');
            builder.append(hex);
        }
        return builder.toString();
    }

    public static byte[] hexStringToByteArray(String value) {
        int length = value.length() / 2;
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = (byte) (Integer.parseInt(value.substring(i * 2, i * 2 + 2), 16) & 0xFF);
        }
        return result;
    }
}
