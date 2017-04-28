package com.gui.log;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * 不间断地扫描输入流
 * 将扫描到的字符流显示在JLabel上
 * Created by luosv on 2017/4/27 0027.
 */
public class LabelLogAppender extends LogAppender {

    private JLabel label;

    /**
     * 默认构造器
     *
     * @param label 记录器名称，该记录器输出的日志信息将被截取并输出到指定的JLabel组件
     * @throws IOException Exception
     */
    public LabelLogAppender(JLabel label) throws IOException {
        super("label");
        this.label = label;
    }

    @Override
    public void run() {
        // 不间断地扫描输入流
        Scanner scanner = new Scanner(reader);
        // 将扫描到的字符流显示在指定的JLabel上
        while (scanner.hasNextLine()) {
            try {
                //睡眠
                Thread.sleep(100);
                String line = scanner.nextLine();
                label.setText(line);
                line = null;
            } catch (Exception ex) {
                //异常信息不作处理
            }
        }
    }
}
