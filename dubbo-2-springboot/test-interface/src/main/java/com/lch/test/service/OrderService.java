package com.lch.test.service;

import java.util.List;

import com.lch.test.bean.UserAddress;

/**
 * �����ӿ�
 * 
 * @author
 *
 */
public interface OrderService {
	public List<UserAddress> initOrder(String userId);
}
