package com.imooc.zhangxiaoxi.lombok;

import lombok.AccessLevel;
import lombok.Getter;

import javax.validation.constraints.NotNull;

/**
 * @Getter注解
 * 为属性生成get方法
 */
public class GetterTest {

    @Getter(
            lazy = true
    )
    private final String field1 = "zhangxiaoxi";

    @Getter(
            value = AccessLevel.PRIVATE,
            onMethod_={@NotNull}
    )
    private String field2;

}
