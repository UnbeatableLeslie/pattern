package com.pengheng.factory.simplefactory;

/**
 * @project pengheng
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class ShanZaiJi implements Mobile {
    public void playGame() {
        System.out.println("山寨机玩游戏");
    }

    public void call() {
        System.out.println("山寨机打电话");
    }

    public void sendMessage() {
        System.out.println("山寨机发短信");
    }
}
