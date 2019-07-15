package com.lch.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lch.test.service.OrderService;

public class MainApplication {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:consumer.xml");
		OrderService orderService = context.getBean(OrderService.class);
		orderService.initOrder("1");
		System.out.println("调用完成");
		System.in.read();
	}
}
