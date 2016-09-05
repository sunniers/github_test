package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.CustomerDao;
import com.zhangjian.dao.CustomerLossDao;
import com.zhangjian.dao.OrderDao;
import com.zhangjian.entity.Customer;
import com.zhangjian.entity.CustomerFw;
import com.zhangjian.entity.CustomerGc;
import com.zhangjian.entity.CustomerGx;
import com.zhangjian.entity.CustomerLoss;
import com.zhangjian.entity.Order;
import com.zhangjian.service.CustomerService;

/**
 * 客户Service接口
 * @author Administrator
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private CustomerLossDao customerLossDao;
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<Customer> find(Map<String, Object> map) {
		return customerDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerDao.getTotal(map);
	}

	@Override
	public int add(Customer customer) {
		return customerDao.add(customer);
	}

	@Override
	public int update(Customer customer) {
		return customerDao.update(customer);
	}

	@Override
	public int delete(Integer id) {
		return customerDao.delete(id);
	}

	@Override
	public Customer findById(Integer id) {
		return customerDao.findById(id);
	}

	@Override
	public void checkCustomerLoss() {
		List<Customer> customerList=customerDao.findLossCustomer(); // 查找流失客户
		for(Customer c:customerList){
			CustomerLoss customerLoss=new CustomerLoss(); // 实例化客户流失实体
			customerLoss.setCusNo(c.getKhno()); // 客户编号
			customerLoss.setCusName(c.getName()); // 客户名称
			customerLoss.setCusManager(c.getCusManager()); // 客户经理
			Order order=orderDao.findLastOrderByCusId(c.getId()); // 查找指定客户最近的订单
			if(order==null){
				customerLoss.setLastOrderTime(null);
			}else{
				customerLoss.setLastOrderTime(order.getOrderDate()); // 设置最近的下单日期				
			}
			customerLossDao.add(customerLoss); // 添加到客户流失表
			c.setState(1); // 客户状态修改成1 流失状态
			customerDao.update(c); 
		}
	}

	@Override
	public List<CustomerGx> findCustomerGx(Map<String, Object> map) {
		return customerDao.findCustomerGx(map);
	}

	@Override
	public Long getTotalCustomerGx(Map<String, Object> map) {
		return customerDao.getTotalCustomerGx(map);
	}

	@Override
	public List<CustomerGc> findCustomerGc() {
		return customerDao.findCustomerGc();
	}

	@Override
	public List<CustomerFw> findCustomerFw() {
		return customerDao.findCustomerFw();
	}

}
