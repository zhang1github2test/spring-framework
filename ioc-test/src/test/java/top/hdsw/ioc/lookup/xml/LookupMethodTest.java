package top.hdsw.ioc.lookup.xml;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.hdsw.ioc.lookup.Command;

public class LookupMethodTest {

	@Test
	public void testLookupMethod(){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("lookup-method.xml");
		AsyncCommand command = applicationContext.getBean("asyncCommand", AsyncCommand.class);
		CommandManager commandManager = applicationContext.getBean(CommandManager.class);
		Command managerCommand = commandManager.createCommand();
		Assertions.assertThat(command != managerCommand).isTrue();
	}
}
