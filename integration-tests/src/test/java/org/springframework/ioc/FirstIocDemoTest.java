package org.springframework.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

public class FirstIocDemoTest {

	@Test
	void loadXmlTest(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/springframework/ioc/first-ioc.xml");
		People people = context.getBean(People.class);

		Assert.isTrue("zhangSan".equals(people.getName()),"people name must be zhangSan!");
	}
}
