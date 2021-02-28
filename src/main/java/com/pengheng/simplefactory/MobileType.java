package com.pengheng.simplefactory;

import com.pengheng.simplefactory.Apple;
import com.pengheng.simplefactory.Mobile;
import com.pengheng.simplefactory.Nokia;
import com.pengheng.simplefactory.Xiaomi;

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
