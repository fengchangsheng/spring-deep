package com.fcs.xmls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Lucare.Feng on 2017/3/30.
 */
public class App {

    public static void main(String[] args) {
//        ApplicationContext ac = new FileSystemXmlApplicationContext("applicationContext.xml");//绝对路径
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean t = (TestBean) ac.getBean("test");
        t.hehe();
    }

}
