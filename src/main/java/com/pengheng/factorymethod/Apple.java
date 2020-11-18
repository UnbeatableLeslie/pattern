package com.pengheng.factorymethod;

/**
 * @project IPersistence_test
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Apple implements Mobile {
    public void playGame() {
        System.out.println("苹果玩游戏");
    }

    public void call() {
        System.out.println("苹果打电话");
    }

    public void sendMessage() {
        System.out.println("苹果发短信");
    }
}
