package com.pengheng.factory.factorymethod;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class NokiaMobileFactory implements MobileFactory {
    public Mobile make() {
        return new Nokia();
    }
}
