package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;

@Configuration
public class AppConfig {

  @Bean
  public BeanLifecycleDemoBean bldb(){ return new BeanLifecycleDemoBean();}

}
