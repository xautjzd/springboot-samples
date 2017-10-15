package redis;

import org.springframework.context.annotation.Configuration;

/**
 * Created by jiangzhengdong on 14/10/2017.
 */
@Configuration
public class RedisConfig {

//	@Bean
//	public RedisConnectionFactory jedisConnectionFactory() {
//		RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
//				.master("master")
//				.sentinel("127.0.0.1", 26380)
//				.sentinel("127.0.0.1", 26381)
//				.sentinel("127.0.0.1", 26382);
//		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(sentinelConfig);
//		jedisConnectionFactory.setPassword("gingko");
//		return jedisConnectionFactory;
//	}
//
//	@Bean
//	public RedisTemplate<String, Object> template() {
//		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
//		redisTemplate.setConnectionFactory(jedisConnectionFactory());
//		RedisSerializer<String> stringSerializer = new StringRedisSerializer();
//		redisTemplate.setKeySerializer(stringSerializer);
//		redisTemplate.setValueSerializer(stringSerializer);
//		return redisTemplate;
//	}
}
