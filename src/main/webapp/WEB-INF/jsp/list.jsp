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
<table border="1" align="center" style="text-align: center;">
<tr>
<th>编号</th><th>书名</th><th>作者</th><th>类型</th><th>价格</th><th colspan="2"><a href="<%=path%>/book/add">添加</a></th>
</tr>
<c:forEach items="${requestScope.books }" var="book">
<tr>
<td>${book.bookNo }</td><td>${book.bookTitle }</td><td>${book.bookAuthor }</td><td>${book.typeId }</td><td>${book.price }</td>
<td><a href="<%=path%>/book/${book.bookNo}?_method=delete">删除</a></td>
<td><a href="<%=path%>/book/${book.bookNo}?_method=update">修改</a></td>
</tr>
</c:forEach>
</table>
</body>
<script type="text/javascript">
window.onload=function(){
	var msg="${msg}";
	if(msg!=null&&msg!=""&&msg!=undefined){
		alert(msg);
	}
}
</script>
</html>