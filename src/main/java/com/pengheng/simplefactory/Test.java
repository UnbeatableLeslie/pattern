package com.pengheng.simplefactory;

/**
 * @project IPersistence_test
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = MobileFactory.build(2);
        mobile.call();
        mobile.playGame();
        mobile.sendMessage();
    }
}
