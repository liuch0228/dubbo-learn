package com.lch.test.service;
/*
 * 用户接口;这个接口以及UserAddress 这个bean,
 * 可能不止一个工程需要引用，为了避免重复，把UserService ，orderService中的
 * 接口和javabean都全部抽取出来放到一个单独的工程中，其他工程只需要依赖该独立的工程即可！！！
 */

import java.util.List;


import com.lch.test.bean.UserAddress;

public interface UserService {

	public List<UserAddress> getUserAddressList(String userId);
}
