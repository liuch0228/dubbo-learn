package com.lch.test.service.impl;

import java.util.Arrays;
import java.util.List;

import com.lch.test.bean.UserAddress;
import com.lch.test.service.UserService;

public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1, "南京市雨花台区", "1", "lucy", "13666657890", "Y");
		UserAddress address2 = new UserAddress(2, "南京市江宁区", "1", "jack", "13666657890", "Y");
		return Arrays.asList(address1,address2);
	}

}
