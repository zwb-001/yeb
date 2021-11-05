package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Admin;
import com.example.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhou
 * @since 2021-11-04
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录返回token
     * @param username
     * @param password
     * @return
     */
    RespBean login(String username, String password);
    /**
     * 根据用户名获取用户
     * @param username
     */
    Admin getAdminByUserName(String username);
}
