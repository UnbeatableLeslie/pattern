package com.atguigu.simplefactory.order;

import com.atguigu.simplefactory.pizza.CheesePizza;
import com.atguigu.simplefactory.pizza.GreekPizza;
import com.atguigu.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author pengheng
 * @Date 2021/2/28 19:25
 * @Remark
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;//订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizza type :");
            String str = bufferedReader.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
