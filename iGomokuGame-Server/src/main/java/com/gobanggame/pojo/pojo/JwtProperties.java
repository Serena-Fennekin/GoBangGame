package com.gobanggame.pojo.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "gobanggame.jwt") //这个字段的值会从配置文件application.yml中加载
@Data
public class JwtProperties {

    /**
     * 用户生成jwt令牌相关配置
     */
    private String SecretKey;
    private long Ttl;
}
