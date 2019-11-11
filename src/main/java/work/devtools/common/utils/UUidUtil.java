package work.devtools.common.utils;

import org.apache.tomcat.util.codec.binary.Base64;

import java.util.UUID;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName: UUidUtil
 * @Description: UUID生成全局唯一
 * @date 2019/04/28
 */
public class UUidUtil {

    /**
     * uuid
     * @return
     */
    public static String uuid() {
        UUID uuid = UUID.randomUUID();
        return  uuid.toString();
    }

    /**
     * 压缩uuid
     * @return
     */
    public static String compressedUuid() {
        UUID uuid = UUID.randomUUID();
        return compressedUUID(uuid);

    }

    /**
     *  uuid压缩
     * @param uuidString
     * @return
     */
    public static String compress(String uuidString) {
        UUID uuid = UUID.fromString(uuidString);
        return compressedUUID(uuid);
    }


    /**
     *  uuid解压
     * @param compressedUuid
     * @return
     */
    public static String uncompress(String compressedUuid) {
        if (compressedUuid.length() != 22) {
            throw new  IllegalArgumentException("Invalid uuid!");
        }
        byte[] byUuid = Base64.decodeBase64(compressedUuid + "==");
        long most = bytes2long(byUuid, 0);
        long least = bytes2long(byUuid, 8);
        UUID uuid = new UUID(most, least);
        return uuid.toString();
    }

    private static String compressedUUID(UUID uuid) {
        byte[] byUuid = new byte[16];
        long least = uuid.getLeastSignificantBits();
        long most = uuid.getMostSignificantBits();
        long2bytes(most, byUuid, 0);
        long2bytes(least, byUuid, 8);
        String compressUUID = Base64.encodeBase64URLSafeString(byUuid);
        return compressUUID;
    }

    private  static void  long2bytes(long value, byte[] bytes, int offset) {
        for (int i = 7; i > -1; i--) {
            bytes[offset++] = (byte) ((value >> 8 * i) & 0xFF);
        }
    }

    private static long  bytes2long(byte[] bytes, int offset) {
        long value = 0;
        for (int i = 7; i > -1; i--) {
            value |= (((long) bytes[offset++]) & 0xFF) << 8 * i;
        }
        return value;
    }
}
