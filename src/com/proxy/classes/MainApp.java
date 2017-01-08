package com.proxy.classes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("spconfig.xml"); 
        BeanFactory fac = new XmlBeanFactory(res);
        MyBean bean1 = (MyBean)fac.getBean("myBean1");
        MyBean bean2 = (MyBean)fac.getBean("myBean2");
        
        System.out.println("Bean 1");
        bean1.execute();
        
        System.out.println("\nBean 2");
        bean2.execute();

	}

}
