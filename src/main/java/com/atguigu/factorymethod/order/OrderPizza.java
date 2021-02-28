package com.atguigu.factorymethod.order;

import com.atguigu.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        do{
            Pizza pizza = createPizza(getType());
            if(pizza !=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                break;
            }
        }while (true);
    }

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("please input pizza type :");
            String str = bufferedReader.readLine();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
