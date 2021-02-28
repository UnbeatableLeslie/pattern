package com.pengheng.factory.factorymethod;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class AppleMobileFactory implements MobileFactory {
    public Mobile make() {
        return new Apple();
    }
}
