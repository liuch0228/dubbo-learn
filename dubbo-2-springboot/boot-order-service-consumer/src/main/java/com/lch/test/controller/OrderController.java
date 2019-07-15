package com.lch.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lch.test.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/initorder")
	@ResponseBody
	public Object initOrder(@RequestParam("uid") String userId) {
		System.out.println("用户id=" + userId);
		return orderService.initOrder(userId);

	}

}
