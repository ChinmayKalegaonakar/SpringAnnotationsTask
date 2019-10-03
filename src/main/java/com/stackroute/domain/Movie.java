package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

  private Actor actor;

  @Autowired
  public Movie(Actor actor) {
    this.actor = actor;
  }

  public Actor getActor() {
    return actor;
  }

  public void setActor(Actor actor) {
    this.actor = actor;
  }

  public void printActor(){
    System.out.println("actor details "+actor.getName()+" "+actor.getGender()+" "+actor.getAge());
  }


}
