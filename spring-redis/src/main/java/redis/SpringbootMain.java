package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootApplication
public class SpringbootMain implements CommandLineRunner {

    @Autowired
    private StringRedisTemplate template;

    @Override
    public void run(String... args) throws Exception {
        HashOperations hashOperations = template.opsForHash();
        hashOperations.put("hz", "name", "jzd");
        ValueOperations<String, String> ops = this.template.opsForValue();
        String key = "spring.boot.redis.test";
        if (!this.template.hasKey(key)) {
            ops.set(key, "foo");
            System.out.println("setted..");
        } else {
            template.delete(key);
        }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootMain.class, args).close();
    }
}
