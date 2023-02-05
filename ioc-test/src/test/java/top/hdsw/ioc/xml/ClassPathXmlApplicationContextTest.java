package top.hdsw.ioc.xml;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextTest {

	@Test
	void firstBeanTest(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("first-bean.xml");
		Assertions.assertThat(applicationContext.containsBean("user")).isTrue();
	}
}
