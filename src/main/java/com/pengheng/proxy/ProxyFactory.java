package com.pengheng.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @project pattern
 * remark 代理对象工厂，通过工厂模式获取代理对象
 * @Author Administrator
 * @date 2020/10/24
 */
public class ProxyFactory {

    /**
     * 创建单例工厂对象
     */
    private ProxyFactory() {

    }

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance() {
        return proxyFactory;
    }

    public <T> T getJDKProxy(final T obj) {
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("通过JDK动态代理收取中介费1w");
                Object ret = method.invoke(obj, args);
                System.out.println("通过JDK动态代理出卖客户信息3毛");
                return ret;
            }
        });
    }

    public <T> T getCglibProxy(final T obj) {
        return (T) Enhancer.create(obj.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("通过Cglib动态代理收取中介费1w");
                Object ret = method.invoke(obj, args);
                System.out.println("通过Cglib动态代理出卖客户信息3毛");
                return ret;
            }
        });
    }
}
