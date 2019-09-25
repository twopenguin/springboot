package com.yummon.braveglory;

import com.yummon.braveglory.service.DemoService;
import com.yummon.braveglory.service.IDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class PlayertoolApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext run = SpringApplication.run(PlayertoolApplication.class, args);
		final IDemoService bean = run.getBean(IDemoService.class);
		bean.demoHello();
	}
}
