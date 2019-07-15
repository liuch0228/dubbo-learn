package com.lch.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
		context.start();
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String bean : beanDefinitionNames) {
			System.out.println(bean);
		}
		System.in.read();// ×èÈûÖ÷Ïß³Ì

	}
}
