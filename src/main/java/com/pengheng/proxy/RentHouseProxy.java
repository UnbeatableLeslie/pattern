package com.pengheng.proxy;

/**
 * @project hetong
 * @remark  静态代理方法
 * @Author Administrator
 * @date 2020/10/24
 */
public class RentHouseProxy implements IRentHouse{

    private IRentHouse rentHouse;

    public RentHouseProxy(IRentHouse rentHouse){
        this.rentHouse = rentHouse;
    }

    public void rent() {
        System.out.println("收取中介费1w");
        rentHouse.rent();
        System.out.println("出卖客户信息3毛");
    }
}
