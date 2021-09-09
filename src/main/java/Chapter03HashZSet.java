import redis.clients.jedis.Jedis;

import java.util.*;

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
        conn.zadd("zset1", 1.0, "a");
        conn.zadd("zset1", 2.0, "b");
        conn.zadd("zset1", 3.0, "c");
        conn.zadd("zset2", 4.0, "d");
        conn.zadd("zset2", 5.0, "e");
        conn.zadd("zset2", 6.0, "f");
//        Set<String> zset1 = conn.zrange("zset1", 0, -1);
//        Long zrem = conn.zrem("zset1", "a");
//        conn.zincrby("zset1", 1.0, "a");
//        System.out.println(conn.zscore("zset1", "a"));
//        以上的命令都是很好理解的，唯一需要注意的地方就是zadd，元素的分数在元素前面
//        Long zrevrank = conn.zrevrank("zset1", "a");
//        注意上面这个命令是返回zset1中元素a的排名，返回值是个long，并且是按从大到小排序
//        Set<String> zset1 = conn.zrevrange("zset1", 0, -1);
//        跟上面的命令差不多，不过返回的是个有序集合，也是从大到小
//        conn.zinterstore("zset3", "zset1", "zset2");
//        交集，并且赋给zset3
//        conn.zunionstore("zset4", "zset1", "zset2");
//        并集，并且赋给zset4
    }
}
