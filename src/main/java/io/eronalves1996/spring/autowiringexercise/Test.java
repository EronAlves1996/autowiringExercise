package io.eronalves1996.spring.autowiringexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("io/eronalves1996/spring/autowiringexercise/config.xml");
		Client bean = (Client) ctx.getBean("client");
		System.out.println(bean);
	}

}
