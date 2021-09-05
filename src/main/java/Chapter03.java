import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Redis各种数据类型的各项操作的联系
 *
 * @author WangYu
 */
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
//        System.out.println(conn.get("another-key"));
//        conn.setbit("another-key", 2, String.valueOf(1));
//        System.out.println(conn.get("another-key"));
//        conn.setbit("another-key", 7, String.valueOf(1));
//        System.out.println(conn.get("another-key"));
//        以上为字符串数据结构指令的练习
//        conn.rpush("list-key", "last");
//        conn.lpush("list-key", "first");
//        conn.rpush("list-key", "new last");
//        System.out.println(conn.lpop("list-key"));
//        conn.rpush("list-key", "a", "b", "c");
//        System.out.println(conn.lrange("list-key", 0, -1));
//        conn.ltrim("list-key", 2, -1);
//        System.out.println(conn.lrange("list-key", 0, -1));
//        conn.del("list-key");
//        conn.rpush("list1", "a", "b", "c");
//        conn.rpush("list2", "d", "e", "f");
//        conn.brpoplpush("list1", "list2", 1);
//        conn.blpop("list1", "list2", String.valueOf(1));
//        System.out.println(conn.lrange("list1", 0, -1));
//        System.out.println(conn.lrange("list2", 0, -1));
//        conn.del("list1", "list2");
//        以上为列表数据结构指令的练习
    }
}
