import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Redis的散列(Hash)、有序集合(ZSET)的操作练习
 */
public class Chapter03HashZSet {
    public static void main(String[] args) {
        Jedis conn = new Jedis("localhost", 6379);
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("k1", "v1");
//        map.put("k2", "v2");
//        conn.hmset("hash1", map);
//        从上面可以看出来hmset方法是塞入一个hashmap
//        List<String> hmget = conn.hmget("hash1", "k1", "k2");
//        从上面可以看出hmget需要指定key和map的key来取出对应的数据
//        conn.hdel("hash1", "k1");
//        hdel也是一样的
//        Long hash1 = conn.hlen("hash1");
//        hlen返回的是散列包含的键值对数量
//        Set<String> hash1 = conn.hkeys("hash1");
//        hkeys返回散列包含的所有键
//        List<String> hash1 = conn.hvals("hash1");
//        hvals返回散列包含的所有值
//        Map<String, String> hash11 = conn.hgetAll("hash1");
//        hgetAll返回包含的所有键值对
//        conn.hincrBy("hash1", "key1", 1);
//        这边是给hash1散列的key1map的值加上整数1，诸如此类还有加上浮点数
        /*
        以上为散列的操作练习
        以下为有序集合的操作练习
         */

    }
}
