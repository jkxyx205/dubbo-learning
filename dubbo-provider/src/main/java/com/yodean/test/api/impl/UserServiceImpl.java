package com.yodean.test.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yodean.test.api.UserService;

/**
 * Created by rick on 7/7/18.
 */
@Service(version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {


    @Override
    public String sayHello(String word) {
        return word;
    }
}
