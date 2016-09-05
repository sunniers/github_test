package com.zhangjian.dao;

import java.util.List;
import java.util.Map;

import com.zhangjian.entity.OrderDetails;

/**
 * ������ϸDao�ӿ�
 * @author Administrator
 *
 */
public interface OrderDetailsDao {

	
	/**
	 * ��ѯ������ϸ����
	 * @param map
	 * @return
	 */
	public List<OrderDetails> find(Map<String,Object> map);
	
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ��ȡָ���������ܽ��
	 * @param orderId
	 * @return
	 */
	public float getTotalPriceByOrderId(Integer orderId);
	
	
	
}