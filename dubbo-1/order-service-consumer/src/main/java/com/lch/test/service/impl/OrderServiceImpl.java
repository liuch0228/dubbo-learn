package com.lch.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lch.test.bean.UserAddress;
import com.lch.test.service.OrderService;
import com.lch.test.service.UserService;

/**
 * 1.�������ṩ��ע�ᵽע������ 2.�÷���������ȥע�����Ķ��ķ����ṩ�ߵķ����ַ
 * 
 * @author
 */
@Service // ������ʱʹ��spring��ע��
public class OrderServiceImpl implements OrderService {

	/*
	 * ����dubbo��������ֻ�������˸ýӿڣ����ýӿڵ�ʵ���������������棬 �������ҪԶ�̹��̵��ò��ܻ�ȡ���ýӿڵ�ʵ��
	 */
	@Autowired
	UserService userService;

	public void initOrder(String userId) {
		System.out.println("�û�id=" + userId);
		// ����userService ��ȡ�û��ջ���ַ
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		addressList.forEach(address -> {
			System.out.println(address);
		});
	}

}
