package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.demo.BeanPostProcessorDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main {

	public static void main(String[] args) {

    ApplicationContext ctx =
      new AnnotationConfigApplicationContext(AppConfig.class);

    BeanLifecycleDemoBean bldb = (BeanLifecycleDemoBean) ctx.getBean(BeanLifecycleDemoBean.class);
    BeanPostProcessorDemoBean bppdb =new BeanPostProcessorDemoBean();
    bppdb.postProcessBeforeInitialization(bldb,BeanLifecycleDemoBean.class.toString());
    bppdb.postProcessAfterInitialization(bldb,BeanLifecycleDemoBean.class.toString());


	}

}
