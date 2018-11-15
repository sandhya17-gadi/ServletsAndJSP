<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${requestScope.DOC.exp > 10 }">
<c:out value="Experienced doctor"></c:out>
</c:if>
<c:if test="${requestScope.DOC.exp < 10 }">
<c:out value="New doctor"></c:out>
</c:if>


<c:if test="${requestScope.DOC.gender =='female' }">
<c:out value="Female doctor"></c:out>
</c:if>
<c:if test="${requestScope.DOC.gender =='male' }">
<c:out value="male doctor"></c:out>
</c:if>

<c:if test="${requestScope.DOC.fee > 500}">
<c:out value="High Fee"></c:out>
</c:if>
<c:if test="${requestScope.DOC.fee < 500 }">
<c:out value="Normal fee"></c:out>
</c:if>

<c:choose></c:choose>



</body>
</html>