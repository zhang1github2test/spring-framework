package top.hdsw.ioc.lookup.annotation;

import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import top.hdsw.ioc.lookup.Command;

import java.util.Map;

@Component
@Scope(AbstractAutowireCapableBeanFactory.SCOPE_PROTOTYPE)
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
