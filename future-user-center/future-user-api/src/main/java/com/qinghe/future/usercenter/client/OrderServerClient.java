package com.qinghe.future.usercenter.client;

import com.qinghe.future.commons.result.Result;
import com.qinghe.future.ordercenter.order.entity.OrderInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "future-order-service")
public interface OrderServerClient {
    @GetMapping(value = "/order/list",produces = MediaType.APPLICATION_JSON_VALUE)
    Result<List<OrderInfo>> list();
}
