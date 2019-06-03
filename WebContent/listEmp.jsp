<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
<script type="text/javascript" src="/myssh2/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="/myssh2/js/my.js"></script>
</head>
<body>
	<h1>用户列表 </h1>
	<table>
	
		<tr><td>ID</td><td>姓名</td><td>邮箱</td><td>级别</td><td>工资</td><td>修改用户</td><td>删除用户</td></tr>
		<c:forEach items="${emplist}" var="emp">
			<tr><td>${emp.id}</td><td>${emp.name}</td><td>${emp.email}</td><td>${emp.grade}</td><td>${emp.salary}</td>
			<td><a href="">修改用户</a></td>
			<td><a class="delid" href="${pageContext.request.contextPath}/employeeAction!delEmp?id=${emp.id}">删除用户</a></td></tr>
		</c:forEach>
	
	</table>
	
	<c:forEach var="i" begin="1" end="${pageCount}">
	
		<a href="${pageContext.request.contextPath}/employeeAction!goListEmp?pageNow=${i}">${i}</a>
	
	</c:forEach>
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>




































