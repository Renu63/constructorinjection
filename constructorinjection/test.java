package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("constructorinjection/Spring.xml");
		
		student s = (student)ap.getBean("s");
		
		System.out.println(s);
	}

}
