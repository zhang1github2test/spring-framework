package top.hdsw.ioc.lookup.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import top.hdsw.ioc.lookup.Command;

@Configuration
@ComponentScan(basePackages = {"top.hdsw.ioc.lookup.annotation"})
public class AppConfig {

	@Bean
	public Command command(){
		return new AsyncCommand();
	}
}
