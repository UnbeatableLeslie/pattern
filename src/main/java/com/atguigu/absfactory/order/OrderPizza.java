package com.atguigu.absfactory.order;

import com.atguigu.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author pengheng
 * @Date 2021/2/28 22:10
 * @Remark
 */
public class OrderPizza {

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        do {
            Pizza pizza = absFactory.createPizza(getType());
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                break;
            }
        } while (true);
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
