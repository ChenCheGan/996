package com.imooc.zhangxiaoxi.lombok;

import lombok.AccessLevel;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @Setter注解
 * 为属性生成set方法
 */
public class SetterTest {

    @Setter
    private String field1;

    @Setter(
            value = AccessLevel.PRIVATE,
            onParam_={@NotNull}
    )
    private String field2;

}
