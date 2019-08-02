package utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * JedisPool工具类
 * 加载配置文件，配置连接池的参数苏
 * 提供获取连接的方法
 */
public class JedisPoolUtils {



    private static JedisPool jedisPool;
    //定义一个静态代码块在类加载的时候就读取这个配置文件
  static{
      //1.读取配置文件
      InputStream in=JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
      //2.创建properties对象
      Properties pro=new Properties();
      //3.关联文件
      try {
          pro.load(in);
      } catch (IOException e) {
          e.printStackTrace();
      }

      //获取数据，设置到JedisPoolConfig中
      JedisPoolConfig config=new JedisPoolConfig();
      /*
      pro.getProperty("maxIdle"):获取到的是一个字符串，用Integer解析为int型
       */
        config.setMaxIdle(Integer.parseInt(pro.getProperty("maxIdle")));
        config.setMaxTotal(Integer.parseInt(pro.getProperty("maxTotal")));

        //初始化JedisPool
        jedisPool=new JedisPool(config,pro.getProperty("localhost"),Integer.parseInt(pro.getProperty("port")));

  }
    /**
     * 获取连接的方法
     */
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

}
