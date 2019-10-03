package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class AppConfig {

  @Bean
  public Movie movie1(){
    return new Movie(actor1());
  }

  @Bean
  public Actor actor1(){
    return new Actor("Actor1","male",30);
  }


}
