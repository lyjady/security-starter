package org.augustus.browser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SecurityBrowserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityBrowserApplication.class, args);
    }

}
