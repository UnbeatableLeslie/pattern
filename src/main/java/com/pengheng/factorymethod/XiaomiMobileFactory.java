package com.pengheng.factorymethod;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class XiaomiMobileFactory implements MobileFactory {
    public Mobile make() {
        return new Xiaomi();
    }
}
