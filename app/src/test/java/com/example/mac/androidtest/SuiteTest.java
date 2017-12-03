package com.example.mac.androidtest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by mac on 2017/12/3.
 * 测试套件:就是组织测试类一起运行的
 * 写一个作为测试套间的入口类，这个类里不包含其他的方法
 * 更改运行测试运行器SuiteTest
 * 将要测试的类作为数组传入到SuiteTest即可
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class, TaskTest2.class})

public class SuiteTest {

}