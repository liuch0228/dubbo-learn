package com.lch.test.service;
/*
 * �û��ӿ�;����ӿ��Լ�UserAddress ���bean,
 * ���ܲ�ֹһ��������Ҫ���ã�Ϊ�˱����ظ�����UserService ��orderService�е�
 * �ӿں�javabean��ȫ����ȡ�����ŵ�һ�������Ĺ����У���������ֻ��Ҫ�����ö����Ĺ��̼��ɣ�����
 */

import java.util.List;


import com.lch.test.bean.UserAddress;

public interface UserService {

	public List<UserAddress> getUserAddressList(String userId);
}
