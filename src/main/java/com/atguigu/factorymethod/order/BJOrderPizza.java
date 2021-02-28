package com.atguigu.factorymethod.order;

import com.atguigu.factorymethod.pizza.BJCheesePizza;
import com.atguigu.factorymethod.pizza.BJGreekPizza;
import com.atguigu.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        if (orderType.equals("cheese")) {
            return new BJCheesePizza();
        }else if(orderType.equals("greek")){
            return new BJGreekPizza();
        }
        return null;
    }
}
