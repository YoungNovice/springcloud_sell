package com.imooc.order.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class ProductInfo {

    @Id
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
