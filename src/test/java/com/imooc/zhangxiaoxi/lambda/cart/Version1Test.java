package com.imooc.zhangxiaoxi.lambda.cart;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Version1Test {

    @Test
    public void filterElectronicsSkus() {
        List<Sku> cartSkuList = CartService.getCartSkuList();

        // 查找购物车中数码类商品
        List<Sku> result =
                CartService.filterElectronicsSkus(cartSkuList);

        System.out.println(
                JSON.toJSONString(result, true));
    }

}
