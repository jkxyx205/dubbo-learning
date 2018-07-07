package com.yodean.oa.sys.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yodean.oa.domain.SysUser;
import com.yodean.oa.sys.api.UserService;
import com.yodean.oa.sys.api.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

/**
 * Created by rick on 7/7/18.
 */
@Service(version = "1.0.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int save(SysUser sysUser) {
        return 0;
    }

    @Override
    public String println(String string) {
        return string;
    }

    @Override
    public PageInfo<SysUser> page(int page, int pageSize) {
        Example example = new Example(SysUser.class);
        PageHelper.startPage(page, pageSize);
        PageInfo<SysUser> pageInfo = new PageInfo<>(sysUserMapper.selectByExample(example));
        return pageInfo;
    }
}
