package com.example.mac.androidtest;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 2017/12/3.
 *
 * @Test:将一个普通的额方法修饰成为一个测试方法
     * @Test(expected = xx.class)
     * @Test(expetimeoutcted = 毫秒)
 * @BeforeClass:它会在所有的方法运行前被执行，static秀水
 * @AfterClass:它会在所有的方法运行结束后被执行，static修饰
 * @Before:会在每一个测试方法被运行前执行一次
 * @After:会在每一个测试方法被运行后执行一次
 * @Ignore:所修饰的测试方法会被测试运行器忽视
 * @RunWith:可以更改测试运行器 org.junit.runner.Runner
 */
public class CalculateTest3 {

    @Test(expected = ArithmeticException.class)
    public void testDivide() throws Exception {
        assertEquals(3, new Calculate().divide(6, 0));
    }

    @Test(timeout = 2000)
    public void testWhile() throws Exception {
        while (true) {
            System.out.println("run  ");
        }
    }


    @Ignore
    @Test
    public void subtract() throws Exception {

    }

}