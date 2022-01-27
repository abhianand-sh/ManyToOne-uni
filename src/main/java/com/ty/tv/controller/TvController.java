package com.ty.tv.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.tv.dto.Dish;
import com.ty.tv.dto.Tv;

public class TvController
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anand");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Tv tv = new Tv();
		tv.setId(1);
		tv.setName("mi");
		tv.setCost(35000);
		
		
		Dish d1 = new Dish();
		d1.setId(1);
		d1.setProvider("tata-sky");
		d1.setTv(tv);
		
		Dish d2 = new Dish();
		d1.setId(2);
		d1.setProvider("reliance-tv");
		d1.setTv(tv);
		
		et.begin();
		em.persist(tv);
		em.persist(d1);
		em.persist(d2);
		et.commit();
		
	}
}
