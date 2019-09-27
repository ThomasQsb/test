package com.testju;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class utest {
    @Test
    void testlist(){
        main cc=new main();
        int[] inlist={-1,2,55,6};
        int expexted=55;
        int result=cc.getlargestelement(inlist);
        assertEquals(expexted, result, "有效数据检验获取最大值！");

    }
}
