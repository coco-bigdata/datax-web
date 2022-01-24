package com.wugui.admin.util;

import com.wugui.datax.admin.util.AESUtil;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class Test {

    @org.junit.Test
    public void test() {
        System.out.println(AESUtil.encrypt("root"));
        System.out.println(AESUtil.encrypt("123456"));
        System.out.println(AESUtil.decrypt("yRjwDFuoPKlqya9h9H2Amg=="));
    }

}
