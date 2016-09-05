package com.zhangjian.service.impl;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangjian.dao.CusDevPlanDao;
import com.zhangjian.entity.CusDevPlan;
import com.zhangjian.service.CusDevPlanService;

/**
 * 客户开发计划Service实现类
 * @author Administrator
 *
 */
@Service("cusDevPlanService")
public class CusDevPlanServiceImpl implements CusDevPlanService{

	@Autowired
	private CusDevPlanDao cusDevPlanDao;
	
	@Override
	public List<CusDevPlan> find(Map<String, Object> map) {
		return cusDevPlanDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return cusDevPlanDao.getTotal(map);
	}

	@Override
	public int update(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.update(cusDevPlan);
	}

	@Override
	public int add(CusDevPlan cusDevPlan) {
		return cusDevPlanDao.add(cusDevPlan);
	}

	@Override
	public int delete(Integer id) {
		return cusDevPlanDao.delete(id);
	}

}
