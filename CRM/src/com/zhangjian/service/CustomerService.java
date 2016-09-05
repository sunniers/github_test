package com.zhangjian.service;

import java.util.List;
import java.util.Map;

import com.zhangjian.entity.Customer;
import com.zhangjian.entity.CustomerFw;
import com.zhangjian.entity.CustomerGc;
import com.zhangjian.entity.CustomerGx;

/**
 * �ͻ�Service�ӿ�
 * @author Administrator
 *
 */
public interface CustomerService {

	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<Customer> find(Map<String,Object> map);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * ���ӿͻ�
	 * @param customer
	 * @return
	 */
	public int add(Customer customer);
	
	/**
	 * �޸Ŀͻ�
	 * @param customer
	 * @return
	 */
	public int update(Customer customer);
	
	/**
	 * ɾ���ͻ�
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	
	/**
	 * ͨ��Id����ʵ��
	 * @param id
	 * @return
	 */
	public Customer findById(Integer id);
	
	/**
	 * ������ʧ�ͻ����������ӵ���ʧ�ͻ�����
	 */
	public void checkCustomerLoss();
	
	/**
	 * ��ѯ�ͻ�����
	 * @param map
	 * @return
	 */
	public List<CustomerGx> findCustomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ����׼�¼��
	 * @param map
	 * @return
	 */
	public Long getTotalCustomerGx(Map<String,Object> map);
	
	/**
	 * ��ѯ�ͻ�����
	 * @return
	 */
	public List<CustomerGc> findCustomerGc();
	
	/**
	 * ��ѯ�ͻ��������
	 * @return
	 */
	public List<CustomerFw> findCustomerFw();
}