package top.hdsw.ioc.lookup;

import java.util.Map;

public interface Command {
	Object execute();

	void setState(Map<String,String> stateMap);
}
