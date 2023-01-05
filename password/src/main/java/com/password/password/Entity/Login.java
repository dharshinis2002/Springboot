package com.password.password.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "login_table")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  int id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private  String password;

  public void setAndEncryptPassword(String password) {
      setPassword(PasswordUtil.getEncryptedPassword(password));
  }
  }

