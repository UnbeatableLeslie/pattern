package com.pengheng.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @project pattern
 * @remark
 * @Author Administrator
 * @date 2020/10/24
 */
public class ProxyPattern {

    static IRentHouse rentHouse = new RentHouseImpl();


    public static void main(String[] args) {
        ProxyFactory.getInstance().getJDKProxy(rentHouse).rent();
        ProxyFactory.getInstance().getCglibProxy(rentHouse).rent();
    }

    /**
     * 普通静态代理 返回代理对象
     */
    public static void staticProxy(){
        RentHouseProxy proxy = new RentHouseProxy(rentHouse);
        proxy.rent();
    }
}
