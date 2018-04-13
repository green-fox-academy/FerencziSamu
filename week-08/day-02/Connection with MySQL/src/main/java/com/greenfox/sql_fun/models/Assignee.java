package com.greenfox.sql_fun.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Assignee {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;

  private String name;
  private String email;

  public Assignee() { }

  public Assignee(String name) {
    this();
    this.name = name;
  }

  public Assignee(String name,String email) {
    this(name);
    this.email = email;
  }

}
