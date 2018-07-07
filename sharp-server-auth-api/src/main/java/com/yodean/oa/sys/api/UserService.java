package com.yodean.oa.sys.api;

import com.github.pagehelper.PageInfo;
import com.yodean.oa.domain.SysUser;

/**
 * Created by rick on 7/6/18.
 */
public interface UserService {

    int save(SysUser sysUser);

    String println(String string);

    PageInfo<SysUser> page(int page, int pageSize);
}
