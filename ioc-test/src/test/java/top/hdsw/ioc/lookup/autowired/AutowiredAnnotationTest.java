package top.hdsw.ioc.lookup.autowired;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredAnnotationTest {
	@Test
	public void testAutowired(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Assertions.assertThat(applicationContext.getBean(Teacher.class).getStudents().size() == 1).isTrue();
	}
}
