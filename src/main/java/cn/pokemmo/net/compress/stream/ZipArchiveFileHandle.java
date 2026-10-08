package cn.pokemmo.net.compress.stream;

import f.*;
import cn.pokemmo.net.packet.InboundPacket;
import cn.pokemmo.net.nio.AbstractNioWorker;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.zip.ZipFile;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.stream.IntStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipArchiveFileHandle extends Dn0 {
   public final ZipFile rK;
   public final ZipEntry Rv0;

   public ZipArchiveFileHandle(ZipFile var1, String var2) {
      super(var2.replace('\\', '/'), zv_1.Gi0);
      this.rK = var1;
      this.Rv0 = var1.getEntry(tx_1.O7(var2.replace('\\', '/')));
   }

   public static boolean WC(FilenameFilter var1, Dn0 var2) {
      return !var1.accept(var2.Br().l00(), var2.o30());
   }

   public static boolean mo0(String var1, Dn0 var2) {
      return !var2.o30().endsWith(var1);
   }

   public static boolean zL0(int var0) {
      return var0 == 47;
   }

   public static boolean ZQ(int var0) {
      return var0 == 47;
   }

   public final Dn0 wp(String var1) {
      var1 = var1.replace('\\', '/');
      return super.Q50.getPath().isEmpty() ? new ZipArchiveFileHandle(this.rK, var1) : new ZipArchiveFileHandle(this.rK, super.Q50.getPath() + "/" + var1);
   }

   public final Dn0 xt(String var1) {
      var1 = var1.replace('\\', '/');
      if (!super.Q50.getPath().isEmpty()) {
         return new ZipArchiveFileHandle(this.rK, new File(super.Q50.getParent(), var1).getPath());
      } else {
         throw new nf_1("Cannot get the sibling of the root.");
      }
   }

   public final Dn0 Br() {
      File var1;
      if ((var1 = super.Q50.getParentFile()) == null) {
         if (super.a5 == zv_1.uq0) {
            var1 = new File("/");
         } else {
            var1 = new File("");
         }
      }

      ZipFile var2 = this.rK;
      return new ZipArchiveFileHandle(var2, var1.getPath());
   }

   public final InputStream uf0() {
      try {
         return this.rK.getInputStream(this.Rv0);
      } catch (IOException var1) {
         throw new nf_1("File not found: " + super.Q50 + " (Archive)");
      }
   }

   public final boolean os0() {
      return this.Rv0 != null;
   }

   public final long Nm0() {
      return this.Rv0.getSize();
   }

   public final long Uy0() {
      return this.Rv0.getTime();
   }

   public final boolean RL() {
      return this.Rv0.isDirectory();
   }

   public final ByteBuffer zs0(MapMode param1) {
      return this.mapZipEntry(param1);
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:174)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY Ljava/nio/channels/FileChannel$MapMode;
      // 004: if_acmpne 1c0
      // 007: aload 0
      // 008: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 00b: invokevirtual java/util/zip/ZipEntry.getSize ()J
      // 00e: aload 0
      // 00f: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 012: invokevirtual java/util/zip/ZipEntry.getCompressedSize ()J
      // 015: lcmp
      // 016: ifne 190
      // 019: aload 0
      // 01a: lconst_0
      // 01b: lstore 2
      // 01c: getfield f/ZipArchiveFileHandle.rK Ljava/util/zip/ZipFile;
      // 01f: invokevirtual java/util/zip/ZipFile.entries ()Ljava/util/Enumeration;
      // 022: astore 4
      // 024: aload 4
      // 026: invokeinterface java/util/Enumeration.hasMoreElements ()Z 1
      // 02b: ifeq 185
      // 02e: aload 0
      // 02f: aload 4
      // 031: invokeinterface java/util/Enumeration.nextElement ()Ljava/lang/Object; 1
      // 036: checkcast java/util/zip/ZipEntry
      // 039: dup
      // 03a: astore 5
      // 03c: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 03f: astore 6
      // 041: invokevirtual f/ZipArchiveFileHandle.os0 ()Z
      // 044: ifeq 053
      // 047: aload 0
      // 048: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 04b: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 04e: astore 7
      // 050: goto 073
      // 053: aload 0
      // 054: getfield f/Dn0.Q50 Ljava/io/File;
      // 057: invokevirtual java/io/File.getPath ()Ljava/lang/String;
      // 05a: bipush 92
      // 05c: bipush 47
      // 05e: invokevirtual java/lang/String.replace (CC)Ljava/lang/String;
      // 061: dup
      // 062: astore 7
      // 064: invokevirtual java/lang/String.isEmpty ()Z
      // 067: ifne 073
      // 06a: aload 7
      // 06c: ldc "/"
      // 06e: invokevirtual java/lang/String.concat (Ljava/lang/String;)Ljava/lang/String;
      // 071: astore 7
      // 073: aload 6
      // 075: aload 7
      // 077: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 07a: ifeq 14a
      // 07d: aload 0
      // 07e: aconst_null
      // 07f: astore 4
      // 081: new java/io/File
      // 084: dup
      // 085: astore 5
      // 087: aload 0
      // 088: getfield f/ZipArchiveFileHandle.rK Ljava/util/zip/ZipFile;
      // 08b: invokevirtual java/util/zip/ZipFile.getName ()Ljava/lang/String;
      // 08e: invokespecial java/io/File.<init> (Ljava/lang/String;)V
      // 091: new java/io/RandomAccessFile
      // 094: dup
      // 095: dup
      // 096: astore 6
      // 098: aload 5
      // 09a: ldc "r"
      // 09c: invokespecial java/io/RandomAccessFile.<init> (Ljava/io/File;Ljava/lang/String;)V
      // 09f: invokevirtual java/io/RandomAccessFile.getChannel ()Ljava/nio/channels/FileChannel;
      // 0a2: astore 4
      // 0a4: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 0a7: dup
      // 0a8: astore 5
      // 0aa: ldc2_w 30
      // 0ad: lstore 7
      // 0af: invokevirtual java/util/zip/ZipEntry.getExtra ()[B
      // 0b2: ifnull 0c1
      // 0b5: aload 5
      // 0b7: invokevirtual java/util/zip/ZipEntry.getExtra ()[B
      // 0ba: arraylength
      // 0bb: i2l
      // 0bc: lload 7
      // 0be: ladd
      // 0bf: lstore 7
      // 0c1: aload 4
      // 0c3: aload 1
      // 0c4: aload 0
      // 0c5: lload 2
      // 0c6: lload 7
      // 0c8: aload 5
      // 0ca: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 0cd: invokevirtual java/lang/String.length ()I
      // 0d0: i2l
      // 0d1: ladd
      // 0d2: ladd
      // 0d3: lstore 2
      // 0d4: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 0d7: invokevirtual java/util/zip/ZipEntry.getSize ()J
      // 0da: lstore 4
      // 0dc: lload 2
      // 0dd: lload 4
      // 0df: invokevirtual java/nio/channels/FileChannel.map (Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
      // 0e2: dup
      // 0e3: aload 6
      // 0e5: swap
      // 0e6: invokestatic java/nio/ByteOrder.nativeOrder ()Ljava/nio/ByteOrder;
      // 0e9: invokevirtual java/nio/ByteBuffer.order (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
      // 0ec: pop
      // 0ed: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 0f0: areturn
      // 0f1: astore 0
      // 0f2: aload 6
      // 0f4: astore 4
      // 0f6: goto 143
      // 0f9: astore 1
      // 0fa: aload 6
      // 0fc: astore 4
      // 0fe: goto 116
      // 101: astore 0
      // 102: aload 6
      // 104: astore 4
      // 106: goto 143
      // 109: astore 1
      // 10a: aload 6
      // 10c: astore 4
      // 10e: goto 116
      // 111: astore 0
      // 112: goto 143
      // 115: astore 1
      // 116: new f/nf_1
      // 119: dup
      // 11a: new java/lang/StringBuilder
      // 11d: dup
      // 11e: invokespecial java/lang/StringBuilder.<init> ()V
      // 121: ldc "Error memory mapping file: "
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: aload 0
      // 127: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 12a: ldc " ("
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: aload 0
      // 130: getfield f/Dn0.a5 Lf/zv_1;
      // 133: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 136: ldc ")"
      // 138: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 13b: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 13e: aload 1
      // 13f: invokespecial f/nf_1.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 142: athrow
      // 143: aload 0
      // 144: aload 4
      // 146: invokestatic f/KT.E1 (Ljava/io/Closeable;)V
      // 149: athrow
      // 14a: aload 5
      // 14c: ldc2_w 30
      // 14f: lstore 6
      // 151: invokevirtual java/util/zip/ZipEntry.getExtra ()[B
      // 154: ifnull 163
      // 157: aload 5
      // 159: invokevirtual java/util/zip/ZipEntry.getExtra ()[B
      // 15c: arraylength
      // 15d: i2l
      // 15e: lload 6
      // 160: ladd
      // 161: lstore 6
      // 163: aload 5
      // 165: lload 6
      // 167: aload 5
      // 169: invokevirtual java/util/zip/ZipEntry.getName ()Ljava/lang/String;
      // 16c: invokevirtual java/lang/String.length ()I
      // 16f: i2l
      // 170: ladd
      // 171: lload 2
      // 172: ladd
      // 173: lstore 2
      // 174: invokevirtual java/util/zip/ZipEntry.isDirectory ()Z
      // 177: ifne 024
      // 17a: aload 5
      // 17c: invokevirtual java/util/zip/ZipEntry.getCompressedSize ()J
      // 17f: lload 2
      // 180: ladd
      // 181: lstore 2
      // 182: goto 024
      // 185: new f/nf_1
      // 188: dup
      // 189: ldc_w "Should not reach here"
      // 18c: invokespecial f/nf_1.<init> (Ljava/lang/String;)V
      // 18f: athrow
      // 190: new f/nf_1
      // 193: dup
      // 194: new java/lang/StringBuilder
      // 197: dup
      // 198: aload 0
      // 199: swap
      // 19a: ldc_w "Can't mmap compressed files: "
      // 19d: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1a0: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 1a3: invokevirtual java/util/zip/ZipEntry.getSize ()J
      // 1a6: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 1a9: ldc_w " != "
      // 1ac: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 1af: aload 0
      // 1b0: getfield f/ZipArchiveFileHandle.Rv0 Ljava/util/zip/ZipEntry;
      // 1b3: invokevirtual java/util/zip/ZipEntry.getCompressedSize ()J
      // 1b6: invokevirtual java/lang/StringBuilder.append (J)Ljava/lang/StringBuilder;
      // 1b9: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1bc: invokespecial f/nf_1.<init> (Ljava/lang/String;)V
      // 1bf: athrow
      // 1c0: new f/nf_1
      // 1c3: dup
      // 1c4: new java/lang/StringBuilder
      // 1c7: dup
      // 1c8: aload 1
      // 1c9: swap
      // 1ca: ldc_w "Zip files can only be mmapped as READ_ONLY, mode was: "
      // 1cd: invokespecial java/lang/StringBuilder.<init> (Ljava/lang/String;)V
      // 1d0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1d3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1d6: invokespecial f/nf_1.<init> (Ljava/lang/String;)V
      // 1d9: athrow
      // try (56 -> 57): 130 java/lang/Exception
      // try (56 -> 57): 128 null
      // try (59 -> 64): 130 java/lang/Exception
      // try (59 -> 64): 128 null
      // try (67 -> 70): 130 java/lang/Exception
      // try (67 -> 70): 128 null
      // try (70 -> 71): 116 java/lang/Exception
      // try (70 -> 71): 112 null
      // try (72 -> 73): 116 java/lang/Exception
      // try (72 -> 73): 112 null
      // try (77 -> 78): 124 java/lang/Exception
      // try (77 -> 78): 120 null
      // try (79 -> 82): 124 java/lang/Exception
      // try (79 -> 82): 120 null
      // try (86 -> 94): 124 java/lang/Exception
      // try (86 -> 94): 120 null
      // try (98 -> 100): 116 java/lang/Exception
      // try (98 -> 100): 112 null
      // try (101 -> 104): 116 java/lang/Exception
      // try (101 -> 104): 112 null
      // try (105 -> 109): 116 java/lang/Exception
      // try (105 -> 109): 112 null
      // try (131 -> 151): 128 null
   }

   private ByteBuffer mapZipEntry(MapMode var1) {
      if (var1 != MapMode.READ_ONLY) {
         throw new nf_1("Zip files can only be mmapped as READ_ONLY, mode was: " + var1);
      }
      if (this.Rv0.getSize() != this.Rv0.getCompressedSize()) {
         throw new nf_1("Can't mmap compressed files: " + this.Rv0.getSize() + " != " + this.Rv0.getCompressedSize());
      }
      long var2 = 0L;
      Enumeration<? extends ZipEntry> var4 = this.rK.entries();
      while (var4.hasMoreElements()) {
         ZipEntry var5 = var4.nextElement();
         String var6 = this.os0() ? this.Rv0.getName() : super.Q50.getPath().replace('\\', '/');
         if (!this.os0() && !var6.isEmpty()) {
            var6 = var6.concat("/");
         }
         if (var5.getName().equals(var6)) {
            RandomAccessFile var7 = null;
            try {
               var7 = new RandomAccessFile(new File(this.rK.getName()), "r");
               FileChannel var8 = var7.getChannel();
               long var9 = 30L;
               if (var5.getExtra() != null) {
                  var9 += var5.getExtra().length;
               }
               MappedByteBuffer var11 = var8.map(var1, var2 + var9 + var5.getName().length(), this.Rv0.getSize());
               var11.order(ByteOrder.nativeOrder());
               return var11;
            } catch (Exception var13) {
               throw new nf_1("Error memory mapping file: " + this + " (" + super.a5 + ")", var13);
            } finally {
               KT.E1(var7);
            }
         }
         long var14 = 30L;
         if (var5.getExtra() != null) {
            var14 += var5.getExtra().length;
         }
         var2 += var14 + var5.getName().length();
         if (!var5.isDirectory()) {
            var2 += var5.getCompressedSize();
         }
      }
      throw new nf_1("Should not reach here");
   }

   public final Dn0[] Ce0() {
      return this.Ds0().toArray(new Dn0[0]);
   }

   public final Dn0[] gH0(String var1) {
      ArrayList<Dn0> var10000 = this.Ds0();
      var10000.removeIf(var1x -> var1x.o30().endsWith(var1) ^ true);
      return var10000.toArray(new Dn0[0]);
   }

   public final Dn0[] WM(FilenameFilter var1) {
      ArrayList<Dn0> var10000 = this.Ds0();
      var10000.removeIf(var1x -> {
         File var2 = var1x.Br().l00();
         return var1.accept(var2, var1x.o30()) ^ true;
      });
      return var10000.toArray(new Dn0[0]);
   }

   public final String o30() {
      ZipEntry var1 = this.Rv0;
      return this.Rv0 != null && var1.isDirectory() ? super.Q50.getName() + "/" : super.Q50.getName();
   }

   public final ArrayList<Dn0> Ds0() {
      ArrayList<Dn0> var1;
      var1 = new ArrayList<>();
      Enumeration var2 = this.rK.entries();
      String var3;
      if (this.os0()) {
         var3 = this.Rv0.getName();
      } else if (!(var3 = super.Q50.getPath().replace('\\', '/')).isEmpty()) {
         var3 = var3.concat("/");
      }

      long var4 = IntStream.range(0, var3.length()).map(var3::charAt).filter(var0 -> var0 == 47).count();

      while (var2.hasMoreElements()) {
         ZipEntry var6;
         long var7;
         if ((var6 = (ZipEntry)var2.nextElement()).getName().startsWith(var3)
            && !var6.getName().equals(var3)
            && (
               (var7 = IntStream.range(0, var6.getName().length()).map(var6.getName()::charAt).filter(var0 -> var0 == 47).count()) == var4
                  || var7 - var4 == 1L && var6.isDirectory()
            )) {
            ZipFile var9 = this.rK;
            var1.add(new ZipArchiveFileHandle(var9, var6.getName()));
         }
      }

      return var1;
   }
}
