package spring_demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Driver {

	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("/demo2/desai.xml");
		BeanFactory beanfactory =new XmlBeanFactory(resource);
		Cat cat = (Cat) beanfactory.getBean("desai");
		System.out.println(cat);
	}
}
