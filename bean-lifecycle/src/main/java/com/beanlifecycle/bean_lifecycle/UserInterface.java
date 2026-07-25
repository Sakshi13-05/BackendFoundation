package com.beanlifecycle.bean_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserInterface implements BeanNameAware, ApplicationContextAware {
    public UserInterface() {
        System.out.println("user service constructor created");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("Application Context is " + applicationContext.getClass());
    }
}
