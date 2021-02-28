package com.atguigu.simplefactory.order;

import com.atguigu.simplefactory.factory.SimpleFactory;

/**
 * @Author pengheng
 * @Date 2021/2/28 19:30
 * @Remark
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }
}
