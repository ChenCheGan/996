package com.imooc.zhangxiaoxi.lombok;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Cleanup注解
 * 资源关闭
 */
public class CleanupTest {

    public void copyFile(String in, String out)
            throws Exception {

        @Cleanup FileInputStream fileInputStream =
                new FileInputStream(in);
        @Cleanup FileOutputStream fileOutputStream =
                new FileOutputStream(out);

        int r;

        while ((r = fileInputStream.read()) != -1) {
            fileOutputStream.write(r);
        }


    }

}
