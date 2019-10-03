package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;

@Configuration
public class AppConfig {

  @Bean(name = "movie1")
  public Movie movie1(){
    return new Movie(actor1());
  }

  @Bean(name = "moviePrototype")
  public Movie moviePrototype(){
    return new Movie(actorPrototype());
  }

  @Bean(name = "actor1")
  public Actor actor1(){
    return new Actor("Actor1","male",30);
  }
  @Bean
  public Actor actor2(){
    return new Actor("Actor2","female",32);
  }
  @Bean
  public Actor actor3(){
    return new Actor("Actor3","male",34);
  }

  @Bean
  @Scope("prototype")
  public Actor actorPrototype(){
    return new Actor("Actor1","male",30);
  }

}
