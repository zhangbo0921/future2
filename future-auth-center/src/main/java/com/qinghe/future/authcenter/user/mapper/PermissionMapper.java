package com.qinghe.future.authcenter.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qinghe.future.authcenter.user.entity.Permission;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 张波
 * @since 2020-10-28
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    List<Permission> getPermissionListByUserId(String userId);
}
