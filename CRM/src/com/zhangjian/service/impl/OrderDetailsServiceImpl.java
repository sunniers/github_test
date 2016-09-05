package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.OrderDetailsDao;
import com.zhangjian.entity.OrderDetails;
import com.zhangjian.service.OrderDetailsService;

/**
 * 订单详情Service实现类
 * @author Administrator
 *
 */
@Service("orderDetailsService")
public class OrderDetailsServiceImpl implements OrderDetailsService{

	@Autowired
	private OrderDetailsDao orderDetailsDao;
	
	@Override
	public List<OrderDetails> find(Map<String, Object> map) {
		return orderDetailsDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return orderDetailsDao.getTotal(map);
	}

	@Override
	public float getTotalPriceByOrderId(Integer orderId) {
		return orderDetailsDao.getTotalPriceByOrderId(orderId);
	}

}
