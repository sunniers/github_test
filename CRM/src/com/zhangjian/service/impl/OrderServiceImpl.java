package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.OrderDao;
import com.zhangjian.entity.Order;
import com.zhangjian.service.OrderService;

/**
 * 订单Service实现类
 * @author Administrator
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<Order> find(Map<String, Object> map) {
		return orderDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return orderDao.getTotal(map);
	}

	@Override
	public Order findById(Integer id) {
		return orderDao.findById(id);
	}

}
