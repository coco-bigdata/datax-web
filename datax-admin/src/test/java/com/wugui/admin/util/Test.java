package com.wugui.admin.util;

import com.wugui.datax.admin.util.AESUtil;

public class Test {

    @org.junit.Test
    public void test() {
        System.out.println(AESUtil.encrypt("root"));
        System.out.println(AESUtil.decrypt("yRjwDFuoPKlqya9h9H2Amg=="));
    }

}
