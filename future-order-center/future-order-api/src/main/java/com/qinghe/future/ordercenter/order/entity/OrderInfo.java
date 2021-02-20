package com.qinghe.future.ordercenter.order.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class OrderInfo  implements Serializable {
    private Integer id;
    private String userName;
    private Float price;
}
