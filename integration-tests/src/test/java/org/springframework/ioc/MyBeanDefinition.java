package org.springframework.ioc;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanDefinition extends AbstractBeanDefinition {
	@Override
	public void setParentName(String parentName) {

	}

	@Override
	public String getParentName() {
		return "null";
	}

	@Override
	public AbstractBeanDefinition cloneBeanDefinition() {
		return new RootBeanDefinition();
	}
}
