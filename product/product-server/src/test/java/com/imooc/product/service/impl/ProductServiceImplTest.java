package com.imooc.product.service.impl;

import com.imooc.product.dto.CartDTO;
import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import com.imooc.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;
import java.util.List;

@Component
@ActiveProfiles("dev1")
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findUpAll1() {
    }

    @Test

    public void decreaseStock() {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setProductId("157875196366160022");
        cartDTO.setProductQuantity(2);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }
}
