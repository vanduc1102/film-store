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
	@Test
	public void testProgram(){
		int a[]={1,2,3,4,-5,-1,2,-3,4,-6};
		int a1 =a[1];
		int a2 =a[0];
		int b = 0;
		for( int i = 0 ; i < a.length ; i++){
			b = a[i];
			if(b > 0 && b < a1)
				a1 = b;
			if(b < 0 && -b != a1 && (-b) <= a2)
				a2 = b;
//			if (b > 0 && b !=a1 && a1 < b)
//				a2 = b;
		}
		System.out.println("a1 = "+a1+"\na2 = "+a2);
		System.out.println("\nResult : "+(a1+a2));
		
	}
}
