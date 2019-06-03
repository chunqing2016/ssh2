<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css" type="text/css" />
</head>
<body>
<div class="box2">

	<h2>欢迎${name}  id:${loginuser.id}  邮箱:${loginuser.email}  您所在的部门 是${loginuser.department.name}        请选择您要的操作</h2>
	<a href="${pageContext.request.contextPath}/employeeAction">添加雇员</a><br />
	<a href="${pageContext.request.contextPath}/employeeAction!goListEmp">显示雇员</a><br />
	<a href="#">查询雇员</a><br />
	<a href="${pageContext.request.contextPath}/exit.jsp">退出系统</a><br />
	</div>
</body>
</html>

