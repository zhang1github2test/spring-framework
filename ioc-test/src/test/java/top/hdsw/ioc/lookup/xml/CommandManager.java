package top.hdsw.ioc.lookup.xml;

import top.hdsw.ioc.lookup.Command;

import java.util.Map;

public abstract class CommandManager {

	public abstract Command createCommand();

	public Object process(Map<String, String> commandState) {
		// grab a new instance of the appropriate Command
		Command command = createCommand();
		// set the state on the (hopefully brand new) Command instance
		command.setState(commandState);
		return command.execute();
	}

}