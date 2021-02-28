package com.atguigu.simplefactory.factory;

import com.atguigu.simplefactory.pizza.CheesePizza;
import com.atguigu.simplefactory.pizza.GreekPizza;
import com.atguigu.simplefactory.pizza.Pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 21:12
 * @Remark
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType) {
        if (orderType.equals("greek")) {
            return new GreekPizza();
        } else if (orderType.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}
