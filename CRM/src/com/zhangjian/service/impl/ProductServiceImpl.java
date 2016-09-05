package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.ProductDao;
import com.zhangjian.entity.Product;
import com.zhangjian.service.ProductService;

/**
 * 产品Service实现类
 * @author Administrator
 *
 */
@Service("productService")
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> find(Map<String, Object> map) {
		return productDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return productDao.getTotal(map);
	}

}
