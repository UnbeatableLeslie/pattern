package com.atguigu.absfactory.order;

import com.atguigu.absfactory.pizza.LDCheesePizza;
import com.atguigu.absfactory.pizza.LDGreekPizza;
import com.atguigu.absfactory.pizza.Pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 22:07
 * @Remark
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            return new LDGreekPizza();
        }
        return null;
    }
}
