package com.example.demo;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    /**
     * 在所有方法执行前执行一次，且只执行一次，通常用来加载配置，初始化资源
     */
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    /**
     * 在所有方法运行完毕之后运行一次，且只执行一次，通常用来释放资源
     */
    @AfterClass
    public static void afterClass() {
        System.out.println("in after class");
    }

    /**
     * 每个测试方法执行前执行一次
     */
    @Before
    public void before() {
        System.out.println("in before");
    }

    /**
     * 每个测试方法执行后执行一次
     */
    @After
    public void after() {
        System.out.println("in after");
    }

    @Test
    public void testCase1() {
        System.out.println("in test case 1");
    }

    @Test
    public void testCase2() {
        System.out.println("in test case 2");
    }

    /**
     * junit HelloWord
     */
    @Test
    public void testHelloWorld() {
        assertEquals(2, 1 + 1);
    }

    /**
     * ignore：暂时不执行该方法
     */
    @Ignore
    @Test
    public void ignoreTest() {
        System.out.println("ignore test");
    }

    @Test
    public void testAssertMethods() {
        String obj1 = "junit";
        String obj2 = "junit";
        String obj3 = "test";
        String obj4 = "test";
        String obj5 = null;

        int var1 = 1;
        int var2 = 2;

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // 断言两个值相等
        Assert.assertEquals(obj1, obj2);

        // 断言两个对象引用相同的对象
        Assert.assertSame(obj3, obj4);

        // 断言两个对象不是引用同一个对象
        Assert.assertNotSame(obj2, obj4);

        // 断言一个对象不为空
        Assert.assertNotNull(obj1);

        // 断言一个对象为空
        Assert.assertNull(obj5);

        // 断言一个条件为真
        Assert.assertTrue(var1 < var2);

        // 断言一个条件为假
        Assert.assertFalse(var1 > var2);

        // 断言预期数组和结果数组相等
        Assert.assertArrayEquals(array1, array2);

    }

}
