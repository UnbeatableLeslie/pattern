package com.atguigu.simplefactory.pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 19:23
 * @Remark
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("希腊味披萨");
        System.out.println(name+"preparing");
    }
}
