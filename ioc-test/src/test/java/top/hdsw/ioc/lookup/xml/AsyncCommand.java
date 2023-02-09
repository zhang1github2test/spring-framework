package top.hdsw.ioc.lookup.xml;

import top.hdsw.ioc.lookup.Command;

import java.util.Map;

public class AsyncCommand implements Command {
	private Map<String, String> stateMap;

	@Override
	public Object execute() {
		System.out.println("执行了异步命令方法");
		return new Object();
	}

	@Override
	public void setState(Map<String, String> stateMap) {
		this.stateMap = stateMap;
	}
}
