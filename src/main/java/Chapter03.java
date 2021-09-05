import redis.clients.jedis.Jedis;

import java.util.Set;

public class Chapter03 {
    public static void main(String[] args) {
        Jedis conn = new Jedis("localhost", 6379);
//        conn.append("string-key", "hello ");
//        System.out.println(1 + conn.get("string-key"));
//        conn.append("string-key", "world!");
//        System.out.println(2 + conn.get("string-key"));
//        String substr = conn.substr("string-key", 3, 7);
//        System.out.println(3 + substr);
//        conn.setrange("string-key", 0, "H");
//        System.out.println(4 + conn.get("string-key"));
//        conn.setrange("string-key", 11, ",how are you");
//        System.out.println(5 + conn.get("string-key"));
        System.out.println(conn.get("another-key"));
        conn.setbit("another-key", 2, String.valueOf(1));
        System.out.println(conn.get("another-key"));
        conn.setbit("another-key", 7, String.valueOf(1));
        System.out.println(conn.get("another-key"));
    }
}
