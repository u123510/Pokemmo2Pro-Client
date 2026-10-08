package cn.pokemmo.rom.nds.fs;

/**
 * 任天堂 NDS 核心 BLZ / LZ 逆向解压缩算法器 (Nintendo DS BLZ / Backward-LZ Decompressor)
 * 
 * 职责:
 * 负责展开 NDS ROM 中的 ARM9/ARM7 二进制段以及 NitroFS 压缩文件条目。
 * 
 * 原混淆类: f.l70_0
 */

public abstract class BlzDecompressor {
    public static byte[] decompress(byte[] input) {
        return lF0(input);
    }

    public static byte[] lF0(byte[] input) {
        int inputLength = input.length;
        int extraLength = (input[inputLength - 4] & 255)
                | ((input[inputLength - 3] & 255) << 8)
                | ((input[inputLength - 2] & 255) << 16)
                | ((input[inputLength - 1] & 127) << 24);

        int compressedLength;
        int outputLength;
        int streamEnd;
        if (extraLength < 1) {
            compressedLength = inputLength;
            outputLength = inputLength;
            streamEnd = 0;
        } else {
            if (inputLength < 8) {
                return null;
            }
            int headerSize = input[inputLength - 5];
            if (headerSize < 8 || headerSize > 11) {
                throw new RuntimeException("blz decompression error");
            }
            if (inputLength <= headerSize) {
                throw new RuntimeException("blz decompression error");
            }
            int footerLength = ((input[inputLength - 8] & 255)
                    | ((input[inputLength - 7] & 255) << 8)
                    | ((input[inputLength - 6] & 255) << 16)
                    | ((input[inputLength - 5] & 127) << 24)) & 16777215;
            compressedLength = inputLength - footerLength;
            int streamEndOffset = footerLength - headerSize;
            outputLength = inputLength + extraLength;
            if (outputLength > 16777215) {
                throw new RuntimeException("blz decompression error");
            }
            streamEnd = compressedLength + streamEndOffset;
        }

        byte[] output = new byte[outputLength];
        int source = 0;
        int destination = 0;
        while (destination < compressedLength) {
            output[destination++] = input[source++];
        }

        for (int left = compressedLength, right = streamEnd - 1; left < right; left++, right--) {
            byte value = input[left];
            input[left] = input[right];
            input[right] = value;
        }

        int outputPosition = compressedLength;
        int inputPosition = compressedLength;
        int flags = 0;
        int flagMask = 0;
        while (outputPosition < outputLength) {
            flagMask >>>= 1;
            if (flagMask == 0) {
                if (inputPosition == streamEnd) {
                    break;
                }
                flags = input[inputPosition++] & 255;
                flagMask = 128;
            }
            if ((flags & flagMask) == 0) {
                if (inputPosition == streamEnd) {
                    break;
                }
                output[outputPosition++] = input[inputPosition++];
            } else {
                if (inputPosition + 1 >= streamEnd) {
                    break;
                }
                int token = ((input[inputPosition] & 255) << 8)
                        | (input[inputPosition + 1] & 255);
                inputPosition += 2;
                int length = (token >>> 12) + 3;
                if (outputPosition + length > outputLength) {
                    length = outputLength - outputPosition;
                }
                int distance = (token & 4095) + 3;
                while (length-- > 0) {
                    output[outputPosition] = output[outputPosition - distance];
                    outputPosition++;
                }
            }
        }

        for (int left = compressedLength, right = outputLength - 1; left < right; left++, right--) {
            byte value = output[left];
            output[left] = output[right];
            output[right] = value;
        }
        return output;
    }
}
