package com.imooc.product.client;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("product")
public interface ProductClient {


    @GetMapping("/msg")
    String productMsg();


    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList 商品信息
     */
    @PostMapping("/product/decreaseStock")
    void decreaseStock(List<DecreaseStockInput> cartDTOList);

}
