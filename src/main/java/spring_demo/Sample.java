package spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sample {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring_demo/MyConfigFile.xml");
//		Bike bike = (Bike) context.getBean("car");
//		System.out.println(bike);
		//context.getBean("car");
		Car car =(Car) context.getBean("car");
		System.out.println(car);
		
		Bike bike=(Bike)context.getBean("bike");
		System.out.println(bike);
	    
		MusicSystem system =(MusicSystem)context.getBean("music");
        System.out.println(system);
	}
}
            