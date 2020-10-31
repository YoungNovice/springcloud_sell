package com.imooc.order.client;

import com.imooc.order.dataobject.ProductInfo;
import com.imooc.order.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("product")
public interface ProductClient {


    @GetMapping("/msg")
    String productMsg();


    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList 商品信息
     */
    @PostMapping("/product/decreaseStock")
    void decreaseStock(List<CartDTO> cartDTOList);

}
