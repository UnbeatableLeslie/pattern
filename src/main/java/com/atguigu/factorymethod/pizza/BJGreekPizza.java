package com.atguigu.factorymethod.pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 21:48
 * @Remark
 */
public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京希腊披萨");
        System.out.println(name + "准备中");
    }
}
