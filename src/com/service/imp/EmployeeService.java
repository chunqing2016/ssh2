package com.service.imp;


import java.util.List;

import org.springframework.stereotype.Service;

import com.basic.BasicService;
import com.domain.Employee;
import com.service.interfaces.EmployeeServiceInter;




@Service
public class EmployeeService extends BasicService implements EmployeeServiceInter {
	

	//显示所有雇员 
	public List showEmployeeList(int pageSize,int pageNow) {
		String hql = "from Employee order by id";
		return this.executeQueryByPage(hql, null, pageNow, pageSize);
	}
	
	

	@Override
	public Employee checkEmployee(Employee e) {

		String hql = "from Employee where name=? and pwd=?";
		
		Object[] parameters = {e.getName(),e.getPwd()};
		List<Object> list = this.executeQuery(hql, parameters);
		
		if (list.size() != 0) {
			return (Employee) list.get(0);
		}else {
			return null;
		}
	}
	
	
	
	
	public int getPageCount(int pageSize) {
		String hql = "select count(*) from Employee";
		return this.queryPageCount(hql, null, pageSize);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

















