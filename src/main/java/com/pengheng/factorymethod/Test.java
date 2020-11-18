package com.pengheng.factorymethod;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Test {
    public static void main(String[] args) {
        MobileFactory mobileFactory = new AppleMobileFactory();
        Mobile mobile = mobileFactory.make();
        mobile.call();
        mobile.playGame();
        mobile.sendMessage();
    }
}
