package com.atguigu.factorymethod.order;

import com.atguigu.factorymethod.pizza.LDCheesePizza;
import com.atguigu.factorymethod.pizza.LDGreekPizza;
import com.atguigu.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new LDCheesePizza();
        } else if (orderType.equals("greek")) {
            return new LDGreekPizza();
        }
        return null;
    }
}
