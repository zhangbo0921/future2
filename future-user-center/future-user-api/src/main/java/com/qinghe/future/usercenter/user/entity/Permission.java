package com.qinghe.future.usercenter.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 张波
 * @since 2020-10-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String resourcesName;

    private String resourcesCode;

    /**
     * 是否在菜单中显示
     * 0:不显示 1:显示
     */
    private Integer show;

    private Integer pid;

    private String uri;

    /**
     * 菜单打开方式
     * 1:内部打开 2:外部打开
     */
    private Integer openType;

    private Integer sort;

    /**
     * 资源类型
     * 1:目录 2:菜单 3:操作
     */
    private Integer type;

    private String desc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}