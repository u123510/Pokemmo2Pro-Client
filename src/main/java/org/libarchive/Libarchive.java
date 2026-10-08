package org.libarchive;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import f.COM9_;
import f.Q3;
import f.Sc0;
import f.com8__2;
import f.ir_2;
import f.xi0_0;

public abstract class Libarchive {
    public static final int nw = 0;

    private static native void init(Class illegalArgumentException, Class sc0);

    public static com8__2 ob() {
        return new com8__2(archive_read_new_internal());
    }

    private static native long archive_read_new_internal();
    private static native int archive_read_support_filter_all_internal(long handle);
    private static native int archive_read_support_format_all_internal(long handle);
    private static native int archive_read_open_filename_internal(long handle, long filename, long blockSize);

    public static int SD(com8__2 reader, COM9_ entry) {
        return archive_read_next_header_internal(reader.U9, entry.U9);
    }

    private static native int archive_read_next_header_internal(long readerHandle, long entryHandle);

    public static int Oq(com8__2 reader) {
        return archive_read_has_encrypted_entries_internal(reader.U9);
    }

    private static native int archive_read_has_encrypted_entries_internal(long handle);

    public static int ub(com8__2 reader, COM9_ entry, Q3 buff, Q3 offset) {
        buff.G4("size_t");
        offset.G4("la_int64_t");
        return archive_read_data_block_internal(reader.U9, entry.U9, buff.U9, offset.U9);
    }

    private static native int archive_read_data_block_internal(long readerHandle, long entryHandle, long buffHandle, long offsetHandle);
    private static native int archive_read_close_internal(long handle);
    private static native int archive_read_free_internal(long handle);

    public static int GG0(com8__2 writer, xi0_0 entry) {
        return archive_write_header_internal(writer.U9, entry.U9);
    }

    private static native int archive_write_header_internal(long writerHandle, long entryHandle);

    public static long E9(com8__2 writer, ir_2 buff, long size, long offset) {
        return archive_write_data_block_internal(writer.U9, buff.U9, size, offset);
    }

    private static native long archive_write_data_block_internal(long writerHandle, long buffHandle, long size, long offset);

    public static int hL(com8__2 writer) {
        return archive_write_finish_entry_internal(writer.U9);
    }

    private static native int archive_write_finish_entry_internal(long handle);
    private static native int archive_write_close_internal(long handle);
    private static native int archive_write_free_internal(long handle);

    public static com8__2 v70() {
        return new com8__2(archive_write_disk_new_internal());
    }

    private static native long archive_write_disk_new_internal();

    public static Q3 D0(com8__2 archive) {
        return new Q3(archive_error_string_internal(archive.U9), false, "const char");
    }

    private static native long archive_error_string_internal(long handle);

    public static Q3 bt0(xi0_0 entry) {
        return new Q3(archive_entry_pathname_internal(entry.U9), false, "const char");
    }

    private static native long archive_entry_pathname_internal(long handle);

    public static long Qo0(xi0_0 entry) {
        return archive_entry_size_internal(entry.U9);
    }

    private static native long archive_entry_size_internal(long handle);

    public static void pt0(xi0_0 entry, Q3 pathname) {
        pathname.G4("const char");
        archive_entry_set_pathname_internal(entry.U9, pathname.U9);
    }

    private static native void archive_entry_set_pathname_internal(long entryHandle, long pathnameHandle);

    public static void IU(com8__2 archive) {
        archive_read_support_filter_all_internal(archive.U9);
    }

    public static void Sz0(com8__2 archive) {
        archive_read_support_format_all_internal(archive.U9);
    }

    public static int Rp(com8__2 archive, Q3 filename) {
        filename.G4("const char");
        return archive_read_open_filename_internal(archive.U9, filename.U9, 10240L);
    }

    public static void XT(com8__2 archive) {
        archive_read_close_internal(archive.U9);
    }

    public static void ip(com8__2 archive) {
        archive_read_free_internal(archive.U9);
    }

    public static void tz0(com8__2 archive) {
        archive_write_close_internal(archive.U9);
    }

    public static void jn0(com8__2 archive) {
        archive_write_free_internal(archive.U9);
    }

    public static void XW(com8__2 archive) {
        archive_write_disk_set_options_internal(archive.U9, 102);
    }

    private static native int archive_write_disk_set_options_internal(long handle, int flags);

    public static void X6(com8__2 archive) {
        archive_write_disk_set_standard_lookup_internal(archive.U9);
    }

    private static native int archive_write_disk_set_standard_lookup_internal(long handle);

    static {
        int dummy1 = CHandler.tv0;
        Class dummy2 = FFITypes.class;
        init(IllegalArgumentException.class, Sc0.class);
    }
}
