package top.hdsw.ioc.lookup.autowired;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;

	private String age;


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
