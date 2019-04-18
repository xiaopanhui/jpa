package com.hui.springdemo.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Wallert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;
    @OneToOne(mappedBy = "wallert")
    private  Auth auth;

    public Wallert(BigDecimal balance) {
        this.balance = balance;
    }
    public Wallert() {

    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//
//    public Auth getAuth() {
//        return auth;
//    }
//
//    public void setAuth(Auth auth) {
//        this.auth = auth;
//    }
}
