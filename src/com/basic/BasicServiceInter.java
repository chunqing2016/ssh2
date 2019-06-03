package com.basic;

import java.util.List;

import com.domain.Department;

public interface BasicServiceInter {

	
	
	public Object findById(Class<Department> class1, Integer id);
	
	public List<Object> executeQuery(String hql, Object[] parameters);
	
	public List<Object> executeQueryByPage(String hql, Object[] parameters, int pageNow, int pageSize);
	
	public void add(Object obj);
	
	public List<Object> executeUpdate(String hql, Object[] parameters);
	
	
	//返回一个对象的操作
	public Object uniqueQuery(String hql,Object[] parameters);
	
	//得到hql,返回pageCount
	public int queryPageCount(String hql,Object[] parameters,int pageSize);
	
	//根据id号删除对象
	
	public void delById(Class class1 ,Integer id);
	
	
	
	
	
	
	
	
	
	
}



















