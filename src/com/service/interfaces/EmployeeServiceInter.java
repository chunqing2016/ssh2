package com.service.interfaces;


import java.util.List;

import com.basic.BasicServiceInter;
import com.domain.Employee;

public interface EmployeeServiceInter extends BasicServiceInter {
	public Employee checkEmployee(Employee e);
	public List showEmployeeList(int pageSize,int pageNow);
	public int getPageCount(int pageSize);
}