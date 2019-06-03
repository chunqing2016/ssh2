package com.web.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.domain.Department;
import com.domain.Employee;
import com.opensymphony.xwork2.Action;
import com.service.interfaces.DepartmentServiceInter;
import com.service.interfaces.EmployeeServiceInter;


public class EmployeeAction implements Action {
	
	private String name;
	private String email;
	private Integer grade;
	private String pwd;
	private Integer departmentId;
	private Float salary;
	
	private Date hiredate;
	
	private DepartmentServiceInter departmentServiceInter;
	private EmployeeServiceInter employeeServiceInter;
	
	
	

	@Override
	public String execute() throws Exception {
			
		return "goAddEmpUi";
	}
	
	
	public String addEmp() {
		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setGrade(grade);
		e.setHiredate(new java.util.Date());
		e.setPwd(pwd);
		e.setSalary(salary);

		
		e.setDepartment((Department)departmentServiceInter.findById(Department.class , departmentId));
		
		try {
			employeeServiceInter.add(e);
		} catch (Exception e2) {
			return "error";
		}
		return "ok";
		
				
	}
	
	
	
	
	
	public String goListEmp() throws Exception {
		HttpServletRequest request =  ServletActionContext.getRequest();	
			
		
			
		
		String s_pageNow = request.getParameter("pageNow");
		int pageNow = 1;
		if (s_pageNow!=null) {
			pageNow = Integer.parseInt(s_pageNow);
		}
					
		
		request.setAttribute("emplist", employeeServiceInter.showEmployeeList(3,pageNow));
		int pageCount = (employeeServiceInter.getPageCount(3));
		request.setAttribute("pageCount", pageCount);
		return "listEmp";
	}
	
	
	//É¾³ý¹ÍÔ±
public String delEmp() throws Exception {
	
	HttpServletRequest request =  ServletActionContext.getRequest();	
	
			
			
		String id = request.getParameter("id");
		
		try {
			employeeServiceInter.delById(Employee.class, Integer.parseInt(id));
		} catch (Exception e) {
			
			return "opererr";
		}
			
		return "operok";
	}
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public DepartmentServiceInter getDepartmentServiceInter() {
		return departmentServiceInter;
	}

	public void setDepartmentServiceInter(DepartmentServiceInter departmentServiceInter) {
		this.departmentServiceInter = departmentServiceInter;
	}

	public EmployeeServiceInter getEmployeeServiceInter() {
		return employeeServiceInter;
	}

	public void setEmployeeServiceInter(EmployeeServiceInter employeeServiceInter) {
		this.employeeServiceInter = employeeServiceInter;
	}
	
	
}
