package top.hdsw.ioc.lookup.annotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;
import top.hdsw.ioc.lookup.Command;

import java.util.Map;

@Component
public abstract class CommandManager {

	@Lookup(value = "asyncCommand")
	public abstract Command createCommand();

	public Object process(Map<String, String> commandState) {
		// grab a new instance of the appropriate Command
		Command command = createCommand();
		// set the state on the (hopefully brand new) Command instance
		command.setState(commandState);
		return command.execute();
	}

}