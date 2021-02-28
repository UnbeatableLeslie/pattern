package com.pengheng.factory.simplefactory;

/**
 * @project pengheng
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Test {
    public static void main(String[] args) {
        Mobile appleMobile = MobileType.APPLE.getMobile();
        appleMobile.call();
        appleMobile.playGame();
        appleMobile.sendMessage();

        Mobile nokiaMobile = MobileType.NOKIA.getMobile();
        nokiaMobile.call();
        nokiaMobile.playGame();
        nokiaMobile.sendMessage();
    }
}
