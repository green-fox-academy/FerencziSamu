package com.greenfox.sql_fun.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;

  public Todo() { }

  public Todo(String title){
    this();
    this.title = title;
  }

  public Todo(String title, boolean urgent) {
    this(title);
    this.urgent = urgent;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this(title, urgent);
    this.done = done;
  }

  public long getId() {

    return id;
  }

  public void setId(long id) {

    this.id = id;
  }

  public String getTitle() {
    return
        title;
  }

  public void setTitle(String title) {

    this.title = title;
  }

  public boolean isUrgent() {

    return urgent;
  }

  public void setUrgent(boolean urgent) {

    this.urgent = urgent;
  }

  public boolean isDone() {

    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}