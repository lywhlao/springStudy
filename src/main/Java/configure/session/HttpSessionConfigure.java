package configure.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 *
 * spring-session configure
 *
 * Created by hzlaojiaqi on 2016/9/14.
 */
@EnableRedisHttpSession
@Configuration
public class HttpSessionConfigure {
    private static final Logger THIRDPARTY_LOG = LoggerFactory.getLogger("THIRDPARTY_LOGGER");
    /**
     * 配置存储 session的redis
     * @param jedisConnectionFactory
     * @return
     */
    @Bean
    @Autowired
    public JedisConnectionFactory connectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        THIRDPARTY_LOG.info("jedis:{}",jedisConnectionFactory);
        return jedisConnectionFactory;
    }

    /**
     * 配合Rest，将session写在header中
     * @return
     */
    @Bean
    public HttpSessionStrategy httpSessionStrategy() {
        return new HeaderHttpSessionStrategy();
    }

    /**
     * session监听器
     * @return
     */
    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }
}
