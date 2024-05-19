package session01.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import session01.bean.Hello;

public class TestHello {

	public static void main(String[] args) {
//		Hello hello1 = new Hello();
//		System.out.println(hello1.getToday());
		
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		
		
		Hello hello1 = ctx.getBean("hello", Hello.class);
		Hello hello2 = ctx.getBean("hello2", Hello.class);
		
		
		
		
	}

}
