package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.CustomerLossDao;
import com.zhangjian.entity.CustomerLoss;
import com.zhangjian.service.CustomerLossService;

/**
 * 客户流失Service实现类
 * @author Administrator
 *
 */
@Service("customerLossService")
public class CustomerLossServiceImpl implements CustomerLossService{

	@Autowired
	private CustomerLossDao customerLossDao;
	
	@Override
	public List<CustomerLoss> find(Map<String, Object> map) {
		return customerLossDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerLossDao.getTotal(map);
	}

	@Override
	public CustomerLoss findById(Integer id) {
		return customerLossDao.findById(id);
	}

	@Override
	public int update(CustomerLoss customerLoss) {
		return customerLossDao.update(customerLoss);
	}

}
