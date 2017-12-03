package com.example.mac.androidtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by mac on 2017/12/3.
 * <p>
 * 1.@beforeclass修饰的方法会在所有方法别调用前执行，
 * 而且该方法是静态的，所以测试类被加载后接着就会运行它，而且内存中它只会存在一份实例，它
 * 比较适合加载配置文件。
 * 2.@afterclass所修的方法通常对资源的清理，如关闭数据库的链接
 * 3.@before、@after会在每个放方法的前后个执行一次。
 */
public class CalculateTest2 {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("this is BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("this is AfterClass");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("this is Before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("this is After");
    }

    @Test
    public void add() throws Exception {
        System.out.println("this is add");
    }

    @Test
    public void divide() throws Exception {
        System.out.println("this is divide");
    }


}