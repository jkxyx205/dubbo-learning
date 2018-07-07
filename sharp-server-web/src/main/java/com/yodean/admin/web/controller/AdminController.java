package com.yodean.admin.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.yodean.oa.domain.SysUser;
import com.yodean.oa.sys.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rick on 7/7/18.
 */
@RestController
public class AdminController {

    @Reference(version = "1.0.0", check = false)
    private UserService userService;

    @GetMapping("/list")
    public PageInfo<SysUser> findAllUser(@RequestParam(defaultValue = "1") int page,
                                         @RequestParam(defaultValue = "10") int pageSize) {
        return userService.page(page, pageSize);
    }
}