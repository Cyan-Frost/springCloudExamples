package com.example.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value ="eureka-provider",fallbackFactory = HystrixClientFallbackFactory.class)
public interface HomeClient {
    @GetMapping("/")
    String consumer();
}
