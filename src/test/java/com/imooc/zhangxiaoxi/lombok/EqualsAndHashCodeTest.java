package com.imooc.zhangxiaoxi.lombok;

import lombok.EqualsAndHashCode;

/**
 * @EqualsAndHashCode注解
 * 生成Equals方法和HashCode方法
 */
@EqualsAndHashCode(
        exclude = {"field1"}
)
public class EqualsAndHashCodeTest {

    private String field1;

    private String field2;

}
