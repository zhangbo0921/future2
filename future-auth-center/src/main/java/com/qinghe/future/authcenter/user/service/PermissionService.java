package com.qinghe.future.authcenter.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qinghe.future.authcenter.user.entity.Permission;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 张波
 * @since 2020-10-30
 */
public interface PermissionService extends IService<Permission> {
    List<Permission> getPermissionListByUserId(String userId);
}
