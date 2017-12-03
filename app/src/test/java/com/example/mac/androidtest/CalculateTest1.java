package com.example.mac.androidtest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mac on 2017/11/30.
 * <p>
 * 1.测试方法上必须使用@test进行修饰
 * 2.测试方法必须使用public void进行修饰，不能带任何的参数
 * 3.新建一个源代码目录保存我们的测试代码
 * 4.测试类包应该和被测试类保持一致
 * 5.测试类使用test作为类名的后缀（不是必须）
 * 6.测试方法使用@test为方法名的后缀（不是必须）
 * <p>
 * <p>
 * 1.failure一般由单元测试使用的断言方法失败所引起的，这表示测试点发
 * 现了问题，就是说程序输出的结果和我们预期的不一样。
 * 2.error是由代码异常所引起的，它可以产生于测试代码本身的错误，也可以是被测试中一个隐藏的bug
 * 3.测试用例不是证明你是的对的，而是证明你没有错。
 * <p>
 * <p>

 *
 * @beroreclss：
 * @afterclass：
 * @before：
 * @after：
 */
public class CalculateTest1 {

    @Test
    public void testAdd() throws Exception {
        assertEquals(2, new Calculate().add(1, 1));
    }

    @Test
    public void testSubtract() throws Exception {

    }

    @Test
    public void testMultiply() throws Exception {

    }

    @Test
    public void testDivide() throws Exception {

    }


}