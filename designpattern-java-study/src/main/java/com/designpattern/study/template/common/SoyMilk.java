package com.designpattern.study.template.common;

public abstract class SoyMilk {

    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    void select() {
        System.out.println("第一步：选择好的新鲜黄豆 ");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    abstract void addCondiments();

    void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }

}
