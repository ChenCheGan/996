package com.imooc.zhangxiaoxi.lombok;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @AllArgsConstructor
 * @NoArgsConstructor
 * @RequiredArgsConstructor
 */
@RequiredArgsConstructor
public class ConstructorTest {

    private final String field1;

    @NonNull
    private String field2;

    private String field3;

}
