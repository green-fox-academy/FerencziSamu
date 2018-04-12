package com.greenfox.sql_fun.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class Assignee {
  static List<Assignee> assignees = new ArrayList<>(Arrays.asList());

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private long id;

  private String name;
  private String email;
}
