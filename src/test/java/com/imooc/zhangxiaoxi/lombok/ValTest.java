package com.imooc.zhangxiaoxi.lombok;

import lombok.val;

import java.util.ArrayList;

/**
 * @val注解
 * 弱语言变量
 */
public class ValTest {

    public ValTest() {
        val field = "zhangxiaoxi";

        val list = new ArrayList<String>();
        list.add("zhangxiaoxi");
    }

}
