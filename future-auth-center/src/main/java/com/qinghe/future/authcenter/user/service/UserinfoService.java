package com.qinghe.future.authcenter.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinghe.future.authcenter.user.entity.Userinfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张波
 * @since 2020-10-30
 */
public interface UserinfoService extends IService<Userinfo> {
    Userinfo loadUserByUsername(String account);
}
