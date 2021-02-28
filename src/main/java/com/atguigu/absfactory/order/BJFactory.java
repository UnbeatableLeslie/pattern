package com.atguigu.absfactory.order;

import com.atguigu.absfactory.pizza.BJCheesePizza;
import com.atguigu.absfactory.pizza.BJGreekPizza;
import com.atguigu.absfactory.pizza.Pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 22:07
 * @Remark
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new BJCheesePizza();
        }else if(orderType.equals("greek")){
            return new BJGreekPizza();
        }
        return null;
    }
}
