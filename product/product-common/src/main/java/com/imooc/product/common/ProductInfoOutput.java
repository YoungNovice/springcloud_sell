package com.imooc.product.common;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductInfoOutput {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    /* 库存*/
    private Integer productStock;

    private String productDescription;

    private String productIcon;

    /* 0 ok 1下架*/
    private Integer productStatus;

    /* 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
