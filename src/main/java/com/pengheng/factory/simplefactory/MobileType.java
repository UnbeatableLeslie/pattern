package com.pengheng.factory.simplefactory;

/**
 * @Author pengheng
 * @Date 2021/2/28 16:25
 * @Remark
 */
public enum MobileType {
    APPLE(new Apple()),NOKIA(new Nokia()),XIAOMI(new Xiaomi()),SHANZHAIJI(new ShanZaiJi());
    private Mobile mobile;
    MobileType(Mobile mobile){
        this.mobile = mobile;
    }
    public Mobile getMobile(){
        return mobile;
    }
}
