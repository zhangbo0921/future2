package com.qinghe.future.authcenter.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qinghe.future.authcenter.user.entity.Userinfo;
import com.qinghe.future.authcenter.user.mapper.UserinfoMapper;
import com.qinghe.future.authcenter.user.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张波
 * @since 2020-10-28
 */
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoMapper, Userinfo> implements UserinfoService {

    @Resource
    private UserinfoMapper userinfoMapper;

    @Override
    public Userinfo loadUserByUsername(String account) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("account",account);
        return userinfoMapper.selectOne(queryWrapper);
    }
}
