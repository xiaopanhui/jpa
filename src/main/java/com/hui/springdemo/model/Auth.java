package com.hui.springdemo.model;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Auth {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;
    private String nickname;
    private String phone;
    private Date sinDate;
    @OneToOne(cascade ={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE}  )
    private  Wallert wallert;

    public Auth(String nickname, String phone, Date sinDate) {
        this.nickname = nickname;
        this.phone = phone;
        this.sinDate = sinDate;
    }
    public Auth() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getSinDate() {
        return sinDate;
    }

    public void setSinDate(Date sinDate) {
        this.sinDate = sinDate;
    }

    public Wallert getWallert() {
        return wallert;
    }

    public void setWallert(Wallert wallert) {
        this.wallert = wallert;
    }
}
