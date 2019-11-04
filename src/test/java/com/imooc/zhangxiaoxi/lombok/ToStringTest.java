package com.imooc.zhangxiaoxi.lombok;

import lombok.Setter;
import lombok.ToString;
import org.junit.Test;

/**
 * @ToString注解
 * 生成toString方法
 */
@ToString(
        includeFieldNames = false,
//        exclude = {"field1"},
//        of = {"field1"},
        doNotUseGetters = false
)
public class ToStringTest {

    @Setter
    private String field1;

    @Setter
    private String field2;

    public String getField2() {
        System.out.println("调用get方法！");
        return this.field2;
    }

    @Test
    public void test() {
        ToStringTest toStringTest = new ToStringTest();
        toStringTest.setField1("zhang");
        toStringTest.setField2("xiaoxi");

        System.out.println(toStringTest.toString());
    }

}
