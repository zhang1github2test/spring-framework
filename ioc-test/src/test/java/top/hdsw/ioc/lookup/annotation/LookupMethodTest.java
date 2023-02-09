package top.hdsw.ioc.lookup.annotation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hdsw.ioc.lookup.Command;

public class LookupMethodTest {

	@Test
	public void testLookupMethod(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AsyncCommand command = applicationContext.getBean("asyncCommand", AsyncCommand.class);
		CommandManager commandManager = applicationContext.getBean(CommandManager.class);
		Command managerCommand = commandManager.createCommand();
		Assertions.assertThat(command != managerCommand).isTrue();
	}
}
