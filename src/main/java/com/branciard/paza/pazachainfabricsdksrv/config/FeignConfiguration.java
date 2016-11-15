package com.branciard.paza.pazachainfabricsdksrv.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.branciard.paza.pazachainfabricsdksrv")
public class FeignConfiguration {

}
