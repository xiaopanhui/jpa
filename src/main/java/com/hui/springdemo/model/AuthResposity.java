package com.hui.springdemo.model;


import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

public interface AuthResposity extends JpaRepository<Auth, Long> {
    List<Auth> findAuthByNickname(String nickname);

    List<Auth> findDistinctByNicknameOrPhone(String nickename, String phone);

    //此处为entity
    @Query("select a from Auth a where a.phone =?1")
    List<Auth> findByPone(String phone);

    @Query("select a from  Auth  a where  a.nickname like %?1%")
    List<Auth> findbyLikePone(String nickname);

    @Query("select a from  Auth  a where  a.nickname like %:nickname%")
    List<Auth> findbyLikePone1(@Param("nickname") String nickname);

    @Query("select a.nickname ,length(a.nickname)  from  Auth  a where  a.nickname like %?1%")
    List<Object> findArry(String nickname);

    @Query("select a from  Auth a where  a.nickname like %?1%")
    List<Auth> findByNickname(String nickname, Sort sort);

    @Query(value = "select * from auth where nickname like %?1%", nativeQuery = true)
    List<Auth> findByNickname1(String nickname);

    @Query(value = "select a from  Auth  a where  id=?1")
    Auth findByone(long id);

    @Transactional
    @Modifying
    @Query("update Auth a set  a.nickname=:nickname where a.phone=:phone")
    int setByNickname2(@Param("nickname") String nickname, @Param("phone") String phone);
}
