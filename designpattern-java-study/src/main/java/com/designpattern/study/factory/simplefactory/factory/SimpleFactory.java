package com.designpattern.study.factory.simplefactory.factory;

import com.designpattern.study.factory.simplefactory.pizza.Pizza;
import com.designpattern.study.factory.simplefactory.pizza.CheesePizza;
import com.designpattern.study.factory.simplefactory.pizza.GreekPizza;
import com.designpattern.study.factory.simplefactory.pizza.PepperPizza;

public class SimpleFactory {

    /**
     * 简单工厂模式(静态工厂模式)
     *
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName(" 胡椒披萨 ");
        } else {
            pizza = null;
        }
        return pizza;
    }
}
