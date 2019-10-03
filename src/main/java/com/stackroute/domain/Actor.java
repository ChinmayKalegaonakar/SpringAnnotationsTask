package com.stackroute.domain;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;

public class Actor implements BeanNameAware {

  private String name;
  private String gender;
  private int age;
  private String beanName;


  public Actor(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String name) {
    beanName = name;
  }
}
