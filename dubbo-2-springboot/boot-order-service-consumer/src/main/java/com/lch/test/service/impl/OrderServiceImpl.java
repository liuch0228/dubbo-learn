package com.lch.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
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
	 * 这里使用dubbo的@Reference注解来远程引用UserService的服务
	 */
//	@Autowired
	@Reference
	UserService userService;

	public List<UserAddress> initOrder(String userId) {
		System.out.println("用户id=" + userId);
		// 调用userService 获取用户收货地址
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		addressList.forEach(address -> {
			System.out.println(address);
		});
		return addressList;
	}

}
