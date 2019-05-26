package com.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhang_htao on 2019/5/26.
 */
@Configuration//标注这是一个配置类，可以认为是spring配置文件中的<beans><bean>属性
public class Config {

    @Bean(name = "helloService02")
    public void helloService() {

    }

}
