package com.qinghe.future.usercenter.user.controller;


import com.qinghe.future.commons.result.Result;
import com.qinghe.future.commons.result.ResultType;
import com.qinghe.future.ordercenter.order.entity.OrderInfo;
import com.qinghe.future.usercenter.client.OrderServerClient;
import com.qinghe.future.usercenter.user.service.UserinfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张波
 * @since 2020-10-30
 */
@RestController
@RequestMapping("/user")
public class UserinfoController {

    @Resource
    private UserinfoService userinfoService;
    @Resource
    private OrderServerClient orderServerClient;

    @GetMapping("/list")
    public Result list(){
        List<OrderInfo> orderList = orderServerClient.list().getData();
        System.out.println(orderList.get(0));
        return new Result(ResultType.SUCCESS,userinfoService.list());
    }
}
