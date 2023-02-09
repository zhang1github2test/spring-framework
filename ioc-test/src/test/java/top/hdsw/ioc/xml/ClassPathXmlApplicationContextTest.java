package top.hdsw.ioc.xml;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextTest {

	@Test
	void firstBeanTest(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("first-bean.xml");
		ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
		Assertions.assertThat(beanFactory instanceof DefaultListableBeanFactory).isTrue();
		Assertions.assertThat(applicationContext.containsBean("user")).isTrue();
	}
}
