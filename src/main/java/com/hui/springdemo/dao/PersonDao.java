package com.hui.springdemo.dao;


import com.hui.springdemo.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonDao {
//
//	//如何获取到和当前事务关联的 EntityManager 对象呢 ?
//	//通过 @PersistenceContext 注解来标记成员变量!
	@PersistenceContext
	private EntityManager entityManager;
//
	public void save(Person person){
		//用于将新创建的 Entity 纳入到 EntityManager 的管理。该方法执行后，
		// 传入 persist() 方法的 Entity 对象转换成持久化状态。
		entityManager.persist(person);
	}

//	public void delete(Integer id) {
//		entityManager.persist(id);
//	}

}
