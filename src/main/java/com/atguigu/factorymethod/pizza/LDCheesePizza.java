package com.atguigu.factorymethod.pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 21:48
 * @Remark
 */
public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println(name + "准备中");
    }
}
