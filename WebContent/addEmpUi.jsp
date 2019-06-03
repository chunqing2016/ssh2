<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/addEmpUi.css" type="text/css" />



</head>
<body>

<div class="box">
	<h1>添加雇员</h1>
	
	
	
	<form action="${pageContext.request.contextPath}/employeeAction!addEmp" method="post" style="line-height:30px">
		<table>
			<tr>
				<td width="64">用户名：</td><td><input type="text" name="name" style="width:150px"/></td>
			</tr>
			<tr>
				<td width="64">邮&nbsp;&nbsp;箱：</td><td><input type="text" name="email" style="width:150px"/></td>
			</tr>
			<tr>
				<td width="64">级&nbsp;&nbsp;别：</td><td><input type="text" name="grade" style="width:150px"/></td>
			</tr>
			<tr>
				<td width="64">密&nbsp;&nbsp;码：</td><td><input type="text" name="pwd" style="width:150px"/></td>
			</tr>
			<tr>
				<td width="64">工&nbsp;&nbsp;资：</td><td><input type="text" name="salary" style="width:150px"/></td>
			</tr>
			
			
			
			<tr>
				<td width="64">部&nbsp;&nbsp;门：</td>
				<td>
					<select name="departmentId">
						<option value="4">财务部</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td width="64"><input type="submit" value="添加"/></td><td><input type="reset" value="重填"/></td>
			</tr>
		</table>		
	</form>	
	
	
	</div>
</body>
</html>
