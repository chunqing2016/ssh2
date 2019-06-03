package com.basic;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Department;


@Transactional
public abstract class BasicService implements BasicServiceInter {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Object findById(Class<Department> class1, Integer id) {
		return this.sessionFactory.getCurrentSession().get(class1, id);
		
	}

	//统一查询方法
	public List<Object> executeQuery(String hql, Object[] parameters) {
		
		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		
		//注入?值
		if (parameters != null && parameters.length>0) {
			for(int i=0; i<parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
			
		
			
			
		} 
		
		return query.list();
		
		
	}

	@Override
	public List<Object> executeQueryByPage(String hql, Object[] parameters, int pageNow, int pageSize) {

		Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
		//注入?值
				if (parameters != null && parameters.length>0) {
					for(int i=0; i<parameters.length; i++) {
						query.setParameter(i, parameters[i]);
					}
										
				} 
				
		//体现分页
		return query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
				
	}
	
	
	@Override
	public Object uniqueQuery(String hql, Object[] parameters) {

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		//给?赋值
		if(parameters!=null && parameters.length>0) {
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
		}
		
		return query.uniqueResult();
	}
	
	
	
	
	
	@Override
	public int queryPageCount(String hql, Object[] parameters, int pageSize) {
		
		Object obj = this.uniqueQuery(hql, parameters);
		int rowCount= Integer.parseInt(obj.toString());
		return (rowCount-1)/pageSize+1;
	}
	
	
	
@Override
public void delById(Class class1, Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(this.findById(class1,id));
}
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void add(Object obj) {
		this.sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public List<Object> executeUpdate(String hql, Object[] parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
