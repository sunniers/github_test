package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.CustomerServiceDao;
import com.zhangjian.entity.CustomerService;
import com.zhangjian.service.CustomerServiceService;

/**
 * 客服服务Service实现类
 * @author Administrator
 *
 */
@Service("customerServiceService")
public class CustomerServiceServiceImpl implements CustomerServiceService{

	@Autowired
	private CustomerServiceDao customerServiceDao;
	
	@Override
	public int add(com.zhangjian.entity.CustomerService customerService) {
		return customerServiceDao.add(customerService);
	}

	@Override
	public List<CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}

	

}
