<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chart List</title>
<link href="/${webAppRootKey}/static/css/chart.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<div class="main">
		<h2 class="title">
			<span>报表管理</span>
		</h2>
		<form action="" method="post">
			<table border="1" width="100%" class="tab">
				<tr>
					<th><input type="checkbox" id="chbAll"></th>
					<th>编号</th>
					<th>图表名</th>
					<th>图表描述</th>
				</tr>
				<c:forEach var="chart" items="${charts}">
					<tr>
						<th><input type="checkbox" name="ids" value="${chart.name}"></th>
						<td>${chart.id}</td>
						<td>${chart.name}</td>
						<td>${chart.description}</td>
						<td><a href="chart/delete/{chart.id}" class="abtn">删除</a> <a href="chart/update/{chart.id}" class="abtn">编辑</a></td>
					</tr>
				</c:forEach>
			</table>
			<p style="color: red">${message}</p>
			<p>
				<a href="add" class="abtn">添加</a> <input type="submit" value="删除选择项" class="btn" />
			</p>
		</form>
	</div>
</body>
</html>