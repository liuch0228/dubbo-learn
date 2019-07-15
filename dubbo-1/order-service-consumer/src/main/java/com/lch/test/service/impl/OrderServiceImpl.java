package com.lch.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lch.test.bean.UserAddress;
import com.lch.test.service.OrderService;
import com.lch.test.service.UserService;

/**
 * 1.将服务提供者注册到注册中心 2.让服务消费者去注册中心订阅服务提供者的服务地址
 * 
 * @author
 */
@Service // 这里暂时使用spring的注解
public class OrderServiceImpl implements OrderService {

	/*
	 * 这里dubbo工程里面只是引入了该接口，而该接口的实现在其他工程里面， 这里就需要远程过程调用才能获取到该接口的实现
	 */
	@Autowired
	UserService userService;

	public void initOrder(String userId) {
		System.out.println("用户id=" + userId);
		// 调用userService 获取用户收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		addressList.forEach(address -> {
			System.out.println(address);
		});
	}

}
