package com.lch.test.service.impl;

import java.util.Arrays;
import java.util.List;

import com.lch.test.bean.UserAddress;
import com.lch.test.service.UserService;

public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		UserAddress address1 = new UserAddress(1, "�Ͼ����껨̨��", "1", "lucy", "13666657890", "Y");
		UserAddress address2 = new UserAddress(2, "�Ͼ��н�����", "1", "jack", "13666657890", "Y");
		return Arrays.asList(address1,address2);
	}

}
