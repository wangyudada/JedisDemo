import redis.clients.jedis.Jedis;

/**
 * Redis字符串(String)、列表(List)、集合(Set)的操作练习
 *
 * @author WangYu
 */
public class Chapter03StringListSet {
    public static void main(String[] args) {
        Jedis conn = new Jedis("localhost", 6379);
//        conn.append("string-key", "hello ");
//        System.out.println(1 + conn.get("string-key"));
//        conn.append("string-key", "world!");
//        System.out.println(2 + conn.get("string-key"));
//        这边跟Java中String类型的substr方法一样，注意是左闭右开区间
//        String substr = conn.substr("string-key", 3, 7);
//        System.out.println(3 + substr);
//        把string-key的第0个元素改成H
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
//        只保留闭区间[a,b]的元素，其他元素删除，如果b为-1，则一直剪切到最后一个元素
//        conn.ltrim("list-key", 2, -1);
//        System.out.println(conn.lrange("list-key", 0, -1));
//        conn.del("list-key");
//        conn.rpush("list1", "a", "b", "c");
//        conn.rpush("list2", "d", "e", "f");
//        从list1的最右边弹出一个元素，装到list2的最左边，1是阻塞的等待最长时间
//        conn.brpoplpush("list1", "list2", 1);
//        从左边(left)依次检查列表，弹出遇到的第一个不为空的元素，1是阻塞最长等待时间
//        conn.blpop("list1", "list2", String.valueOf(1));
//        System.out.println(conn.lrange("list1", 0, -1));
//        System.out.println(conn.lrange("list2", 0, -1));
//        conn.del("list1", "list2");
//        以上为列表数据结构指令的练习
//        conn.sadd("set1", "a", "b", "c");
//        移除，如果元素已经被移除，则返回false
//        conn.srem("set1", "a");
//        返回集合所包含的元素数量
//        Long set1 = conn.scard("set1");
//        从set1中将元素b 剪切 到set2中，如果剪切成功，返回1，否则返回2
//        Long smove = conn.smove("set1", "set2", "b");
//        返回那些存在于第一个集合，但不存在于其他集合中的元素，即数学中的差集运算
//        Set<String> sdiff = conn.sdiff("set1", "set2");
//        将后面的集合的差集的结果存到前面的集合中
//        conn.sdiffstore("set3", "set1", "set2");
//        返回多个集合的交集
//        Set<String> sinter = conn.sinter("set1", "set3");
//        返回后面多个集合的交集，并且存入前面的集合中(如果集合不存在，则新建一个)
//        conn.sinterstore("set4", "set1", "set3");
//        返回多个集合的并集
//        Set<String> sunion = conn.sunion("set1", "set2");
//        返回多个集合的并集并且存入set5集合之中
//        conn.sunionstore("set5", "set1", "set2");
//        smembers方法是返回集合key中的所有元素
//        System.out.println(conn.smembers("set1"));
//        System.out.println(conn.smembers("set2"));
//        System.out.println(conn.smembers("set3"));
//        System.out.println(conn.smembers("set4"));
//        System.out.println(conn.smembers("set5"));
//        以上为集合的操作练习和解释，可以看到集合的操作基本上都有一个前缀s
    }
}
