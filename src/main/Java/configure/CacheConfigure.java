package configure;

import bean.UserEntity;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by hzlaojiaqi on 2016/8/16.
 */
@Configuration
@EnableCaching
public class CacheConfigure {


    @Bean
    CacheManager cacheManager() {
        return new RedisCacheManager(redisTemplate());
    }

    @Bean
    public JedisConnectionFactory jedisConnectionFactory(){
        JedisConnectionFactory jedisConnectionFactory=new JedisConnectionFactory();
        jedisConnectionFactory.setHostName("127.0.0.1");
        jedisConnectionFactory.setPort(6379);
        jedisConnectionFactory.afterPropertiesSet();
        return  jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, UserEntity> redisTemplate(){
        RedisTemplate<String,UserEntity> redisTemplate=new RedisTemplate<String, UserEntity>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        redisTemplate.afterPropertiesSet();
        return  redisTemplate;
    }


}
