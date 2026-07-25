package com.beanlifecycle.bean_lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserInterface implements BeanNameAware {
    public UserInterface() {
        System.out.println("user service constructor created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }
}
