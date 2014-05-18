package cn.oa.test;

import javax.faces.application.Application;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void testBean() throws Exception {
		TestAction testAction= (TestAction) ac.getBean("testAction");
		System.out.println(testAction);
	}
	
	//测试sessionFactory
	@Test
	public void testSessionFactory() throws Exception {
		SessionFactory sessinfactory=(SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessinfactory);
	}
	//测试事物
	public void testTransacation() throws Exception {
		
	}

}
