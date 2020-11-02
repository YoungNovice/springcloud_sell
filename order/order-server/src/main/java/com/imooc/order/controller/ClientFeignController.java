package com.imooc.order.controller;

import com.imooc.product.client.ProductClient;
import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class ClientFeignController {

    @Autowired
    private ProductClient productClient;


    @GetMapping("getProductMsg")
    public String getProductMsg() {
        String response = productClient.productMsg();
        log.info("response={}", response);
        return response;
    }

    @GetMapping("/getProductList")
    public Object getProductList() {
        List<ProductInfoOutput> productInfos = productClient.listForOrder(Arrays.asList("164103465734242707", "157875227953464068"));
        log.info("productInfos={}", productInfos);
        return productInfos;
    }

    @GetMapping("/productDecreaseStock")
    public void productDecreaseStock() {
        DecreaseStockInput cartDTO = new DecreaseStockInput();
        cartDTO.setProductId("164103465734242707");
        cartDTO.setProductQuantity(-6);
        productClient.decreaseStock(Arrays.asList(cartDTO));
    }
}
