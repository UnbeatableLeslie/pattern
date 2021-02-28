package com.atguigu.simplefactory.pizza;

/**
 * @Author pengheng
 * @Date 2021/2/28 19:22
 * @Remark
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cutting");
    }

    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
