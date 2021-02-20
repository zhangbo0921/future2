package com.qinghe.future.ordercenter.order.controller;

import com.qinghe.future.commons.result.Result;
import com.qinghe.future.commons.result.ResultType;
import com.qinghe.future.ordercenter.order.entity.OrderInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    public Result<List<OrderInfo>> list(){
        List<OrderInfo> res = new ArrayList<>();
        OrderInfo order = new OrderInfo();
        order.setId(1);
        order.setPrice(1928.0f);
        order.setUserName("张波");
        res.add(order);
        return new Result<>(ResultType.QUERY_SUCCESS,res);
    }
}
