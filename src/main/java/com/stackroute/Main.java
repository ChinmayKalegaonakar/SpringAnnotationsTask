package com.stackroute;

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

    Movie movie1 = (Movie)ctx.getBean("movie1");
    Movie movie2 = (Movie)ctx.getBean("movie1");
    //prints actor details Actor1 male 30
    movie1.printActor();
    System.out.println(movie1==movie2);

    Movie moviePrototype = (Movie)ctx.getBean("moviePrototype");
    System.out.println(moviePrototype==movie1);


	}

}
