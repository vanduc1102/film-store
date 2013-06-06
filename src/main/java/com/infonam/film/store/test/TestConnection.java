package com.infonam.film.store.test;

import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.Test;

import com.infonam.film.store.util.HibernateUtil;

public class TestConnection {
	@Test
	public void sessionOpen(){
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 assertTrue(session.isOpen());
	}
	@Test
	public void testString(){
		String in = new String("a");
		assertTrue(in.equals( "a"));
		Integer ing = new Integer(102);
		assertTrue(ing == 102);
	}
	@Test
	public void testLoop(){
		int i = 0;
		int j = 5;
		for( ; (i < 3)&& (j++ < 10) ; i++)
		{
			System.out.print(i+" : " +j+ " ");
		}
		System.out.println(i + " : " +j);
	}
}
