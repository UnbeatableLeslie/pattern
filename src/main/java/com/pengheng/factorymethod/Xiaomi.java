package com.pengheng.factorymethod;

/**
 * @project pengheng
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Xiaomi implements Mobile {
    public void playGame() {
        System.out.println("小米玩游戏");
    }

    public void call() {
        System.out.println("小米打电话");
    }

    public void sendMessage() {
        System.out.println("小米发短信");
    }
}
