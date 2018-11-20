<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/${dashxroot}/static/css/chart.css" type="text/css" rel="stylesheet" />
<title>新增报表</title>
</head>
<body>
	<div class="main">
		<h2 class="title">
			<span>新增报表</span>
		</h2>
		<form action="addPost" method="post">
			<fieldset>
				<legend>报表</legend>
				<p>
					<label for="title">报表名称：</label> <input type="text" id="name" name="name" value="${chart.name}" />
				</p>
				<p>
					<label for="title">报表描述：</label> <input type="text" id="description" name="description" value="${chart.description}" />
				</p>
				<p>
					<input type="submit" value="保存" class="btn">
				</p>
			</fieldset>
		</form>
		<p style="color: red">${message}</p>
		<p>
			<a href="list" class="abtn">返回列表</a>
		</p>
	</div>
</body>
</html>