package com.hui.springdemo.dao;


import com.hui.springdemo.model.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonDao {
//
//	//��λ�ȡ���͵�ǰ��������� EntityManager ������ ?
//	//ͨ�� @PersistenceContext ע������ǳ�Ա����!
	@PersistenceContext
	private EntityManager entityManager;
//
	public void save(Person person){
		//���ڽ��´����� Entity ���뵽 EntityManager �Ĺ����÷���ִ�к�
		// ���� persist() ������ Entity ����ת���ɳ־û�״̬��
		entityManager.persist(person);
	}

//	public void delete(Integer id) {
//		entityManager.persist(id);
//	}

}
