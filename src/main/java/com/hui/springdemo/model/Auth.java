package com.hui.springdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Auth {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;
    private String phone;
    private Date SinDate;
}
