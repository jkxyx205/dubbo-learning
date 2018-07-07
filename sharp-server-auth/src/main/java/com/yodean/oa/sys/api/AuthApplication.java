package com.yodean.oa.sys.api;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
//import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by rick on 7/6/18.
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.yodean.oa.sys.api")
@MapperScan(basePackages="com.yodean.oa.sys.api.mapper")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
//        Main.main(args);
    }
}
