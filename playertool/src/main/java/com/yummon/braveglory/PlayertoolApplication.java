package com.yummon.braveglory;

import com.yummon.braveglory.service.DemoService;
import com.yummon.braveglory.service.IDemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.IOException;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PlayertoolApplication {

	public static void main(String[] args) throws IOException {
		final ConfigurableApplicationContext run = SpringApplication.run(PlayertoolApplication.class, args);
		final IDemoService bean = run.getBean(IDemoService.class);
		bean.demoHello();
		System.in.read();
	}
}
