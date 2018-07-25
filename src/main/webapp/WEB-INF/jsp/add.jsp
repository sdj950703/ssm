<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%String path=request.getContextPath(); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path %>/book/toadd" method="post">
<table>
<tr><th colspan="2">添加图书</th></tr>
<tr>
<td>书名</td><td><input type="text" name="bookTitle"/></td>
</tr>
<tr>
<td>作者</td><td><input type="text" name="bookAuthor"/></td>
</tr>
<tr>
<td>类型</td><td><input type="text" name="typeId"/></td>
</tr>
<tr>
<td>价格</td><td><input type="text" name="price"/></td>
</tr>
<tr>
<td><input type="submit" value="提交"/></td>
</tr>
</table>
</form>

</body>
</html>