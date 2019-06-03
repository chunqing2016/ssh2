package com.web.action;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.domain.Employee;
import com.opensymphony.xwork2.Action;
import com.service.interfaces.EmployeeServiceInter;

public class LoginAction implements Action {

	private EmployeeServiceInter employeeServiceInter;
	
	
	private String name;
	public EmployeeServiceInter getEmployeeServiceInter() {
		return employeeServiceInter;
	}
	
	public void setEmployeeServiceInter(EmployeeServiceInter employeeServiceInter) {
		this.employeeServiceInter = employeeServiceInter;
	}

	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String execute() throws Exception {

	
		Employee e = new Employee();
		e.setName(name);
		e.setPwd(pwd);
		e = employeeServiceInter.checkEmployee(e);
		if (e != null) {
			HttpServletRequest request =  ServletActionContext.getRequest();
			//创建session对象
			HttpSession session = request.getSession();
			//把用户数据保存在session域对象中
			session.setAttribute("loginuser", e);			
			
			return SUCCESS;
		} else {
			return "fail";
		}
	
	}

	
	
	public String goMainFrame() throws Exception {
		HttpServletRequest request =  ServletActionContext.getRequest();
		
		if (request.getSession().getAttribute("loginuser") != null) {
			return SUCCESS;
		} else {
			return "err";
		}
		
	
	}
	
	
	
	
	
	
	
	
	
	
}




























