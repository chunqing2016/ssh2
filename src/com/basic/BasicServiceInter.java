package com.basic;

import java.util.List;

import com.domain.Department;

public interface BasicServiceInter {

	
	
	public Object findById(Class<Department> class1, Integer id);
	
	public List<Object> executeQuery(String hql, Object[] parameters);
	
	public List<Object> executeQueryByPage(String hql, Object[] parameters, int pageNow, int pageSize);
	
	public void add(Object obj);
	
	public List<Object> executeUpdate(String hql, Object[] parameters);
	
	
	//����һ������Ĳ���
	public Object uniqueQuery(String hql,Object[] parameters);
	
	//�õ�hql,����pageCount
	public int queryPageCount(String hql,Object[] parameters,int pageSize);
	
	//����id��ɾ������
	
	public void delById(Class class1 ,Integer id);
	
	
	
	
	
	
	
	
	
	
}



















