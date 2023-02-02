package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingClass {
 public static void main(String[] args) {
	//ApplicationContext context = new ClassPathXmlApplicationContext("/spring_demo/xyz.xml");
	ApplicationContext context = new AnnotationConfigApplicationContext(Applicationabc.class);
	 
	Animal animal =(Animal) context.getBean("animal");
	
	System.out.println(animal);
}
}
