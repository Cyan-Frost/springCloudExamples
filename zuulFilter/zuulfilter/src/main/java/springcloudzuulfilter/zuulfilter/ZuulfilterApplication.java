package springcloudzuulfilter.zuulfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy //通过这个注解开启Zuul 服务网关
@SpringBootApplication
public class ZuulfilterApplication {
    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
    @Bean
    public PasswordFilter PasswordFilter() {
        return new PasswordFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(ZuulfilterApplication.class, args);
    }

}
