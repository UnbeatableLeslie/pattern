package com.pengheng.simplefactory;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/11/18
 */
public class MobileFactory {

    public static Mobile build(Integer type){
        switch (type){
            case 1:
                return new Apple();
            case 2:
                return new Nokia();
            case 3:
                return new Xiaomi();
            default:
                return new Shanzaiji();
        }
    }
}
