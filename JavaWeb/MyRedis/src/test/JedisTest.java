package test;

import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import utils.JedisPoolUtils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    //Jedis入门
    @Test
    public void test1(){
        //1.获取连接：
        // Jedis jedis=new Jedis():如果Jedis里面什么都不写。默认值为localhost和6379
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        jedis.set("username","zhangsan");
        //3.关闭连接
        jedis.close();
    }


    //String 数据结构操作
    @Test
    public void test2(){
        //1.获取连接
        Jedis jedis=new Jedis("localhost",6379);
        //2.操作
        //存储
        jedis.set("username","zhangsan");
        //获取
        String username=jedis.get("username");
        System.out.println(username);
        //可以使用setex()方法存储可以指定过期时间（自动删除：激活码）  key vale
        //activecode :激活码->key
        //20秒后自动删除该值
        jedis.setex("activecode",20,"hehe");
        //3.关闭连接
        jedis.close();
    }

    //hash数据结构
    @Test
    public void test3(){
        //1.获取连接：
        // Jedis jedis=new Jedis():如果Jedis里面什么都不写。默认值为localhost和6379
        Jedis jedis=new Jedis();
        //2.操作
        //存储
        jedis.hset("user","name","zhangsan");
        jedis.hset("user","age","20");
        jedis.hset("user","gender","boy");
        //获取
        String name=jedis.hget("user","name");
        System.out.println(name);

        //获取所有的数据
        Map<String,String> user=jedis.hgetAll("user");
        System.out.println(user);

        //遍历集合：keyset entryset
        Set<String> keyset=user.keySet();
        for(String key:keyset){
            //获取value
            String value=user.get(key);
            System.out.println(key+": "+value);
        }
        //3.关闭连接
        jedis.close();
    }

    //list数据结构
    @Test
    public void test4(){
        //1.获取连接：
        // Jedis jedis=new Jedis():如果Jedis里面什么都不写。默认值为localhost和6379
        Jedis jedis=new Jedis();
        //2.操作
        //存储
        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");

        //list获取范围
        List<String> mylist=jedis.lrange("mylist",0,-1);
        System.out.println(mylist);

        //list 弹出
        String element1=jedis.lpop("mylist");
        System.out.println(element1);
        String element2=jedis.rpop("mylist");
        System.out.println(element2);
        //3.关闭连接
        jedis.close();
    }
    //list数据结构
    @Test
    public void test5(){
        //1.获取连接：
        // Jedis jedis=new Jedis():如果Jedis里面什么都不写。默认值为localhost和6379
        Jedis jedis=new Jedis();
        //2.操作
        //存储
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","20");
        jedis.hset("user","gender","male");

        //获取值
        String name=jedis.hget("user","name");
        System.out.println(name);
       //获取hash里面的所有内容
        Map<String,String> user=jedis.hgetAll("user");
        //遍历集合 ：keyset获取值
        Set<String> keyset=user.keySet();
        for(String key:keyset){
            //获取value
            String value=user.get(key);
            System.out.println(key+": "+value);
        }
        //3.关闭连接
        jedis.close();
    }
    @Test
    public void test6(){
        //1.获取连接：
        Jedis jedis=new Jedis();
        //2.操作
        //set存储
        jedis.sadd("myset","java","c++","html","css");
        //set获取
        Set<String> myset=jedis.smembers("myset");
        System.out.println(myset);
        //3.关闭连接
        jedis.close();
    }
    @Test
    public void test(){
        //1.获取连接：
        Jedis jedis=new Jedis();
        //2.操作
        //sortedset存储
        jedis.zadd("mysortedset",80,"zhangsan");
        jedis.zadd("mysortedset",90,"lisi");
        jedis.zadd("mysortedset",60,"wangwu");

        //set获取
        Set<String> mysortedset=jedis.zrange("mysortedset",0,-1);
        System.out.println(mysortedset);
        //3.关闭连接
        jedis.close();
    }

    @Test
    public void test8(){
        //0.创建一个配置对象
        JedisPoolConfig config=new JedisPoolConfig();
        config.setMaxTotal(50);//最大允许连接数
        config.setMaxIdle(10);//最大空闲连接

        //1.创建连接池对象
        JedisPool jedisPool=new JedisPool();
        //2.获取连接
        Jedis jedis=jedisPool.getResource();

        //3.使用
        jedis.set("haha","heiehi");


        //4.关闭归还到连接池中
        jedis.close();

    }

    @Test
    public void test9(){
        //通过连接池工具类获取
        Jedis jedis=JedisPoolUtils.getJedis();
        //使用
        jedis.set("heihei","hehe");
        //关闭  还回到连接池中
        jedis.close();

    }
}
