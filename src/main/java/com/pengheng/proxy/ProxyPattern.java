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
        ProxyPattern.JDKProxy().rent();
        System.out.println("================");
        ProxyPattern.CglibProxy().rent();
        System.out.println("================");
        ProxyPattern.staticProxy();
    }
    /**
     * JDK动态代理 返回对象本身
     */
    public static IRentHouse JDKProxy(){
        return (IRentHouse) Proxy.newProxyInstance(rentHouse.getClass().getClassLoader(), rentHouse.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("收取中介费1w");
                Object ret = method.invoke(rentHouse, args);
                System.out.println("出卖客户信息3毛");
                return ret;
            }
        });
    }

    /**
     * Cglib 动态代理 返回对象本身
     */
    public static IRentHouse CglibProxy(){
        return (IRentHouse) Enhancer.create(rentHouse.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("收取中介费1w");
                Object ret = method.invoke(rentHouse, args);
                System.out.println("出卖客户信息3毛");
                return ret;
            }
        });
    }

    /**
     * 普通静态代理 返回代理对象
     */
    public static void staticProxy(){
        RentHouseProxy proxy = new RentHouseProxy(rentHouse);
        proxy.rent();
    }
}
