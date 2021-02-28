package com.pengheng.factorymethod;

/**
 * @project pengheng
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Nokia implements Mobile {
    public void playGame() {
        System.out.println("诺基亚玩游戏");
    }

    public void call() {
        System.out.println("诺基亚打电话");
    }

    public void sendMessage() {
        System.out.println("诺基亚发短信");
    }
}
