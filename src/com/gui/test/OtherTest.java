package com.gui.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 测试外部调用
 * Created by luosv on 2017/4/28 0028.
 */
public class OtherTest {

    private static final Log log = LogFactory.getLog(OtherTest.class);

    public static void printLog() {
        for (int i = 0; i < 100; i++) {
            log.info("外部测试日志输出 " + i);
        }
    }

}
