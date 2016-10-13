<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- //10.10-3-5420 -->
**상품자료**(mvc + mybatis)<br>
<table border="1">
	<tr><th>CODE</th><th>품명</th><th>수랴</th><th>단가</th></tr>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:forEach var="s" items="${data }">
		<tr>
			<td>${s.code }</td>
			<td>${s.sang }</td>
			<td>${s.su }</td>
			<td>${s.dan }</td>
		</tr>
	</c:forEach>
<!-- 	검색 -->
<!-- 	//10.10-4-0 -->
	<tr>
		<td colspan="4">
			<form action="search" method="post">
				상품명: <input type="text" name="searchValue">
				<input type="submit" value="검색">
			</form>

</table>
</body>
</html>