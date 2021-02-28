package com.atguigu.absfactory.order;

import com.atguigu.absfactory.pizza.Pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 22:06
 * @Remark 一个抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
