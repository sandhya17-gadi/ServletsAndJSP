<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <jsp:useBean id="Acc" class="com.training.entity.BankAccount" scope="page"></jsp:useBean>
   
   
   <jsp:getProperty property="id" name="Acc"/>
   <jsp:getProperty property="customerName" name="Acc"/>
    <jsp:getProperty property="balance" name="Acc"/>
  
    <jsp:setProperty property="id" name="Acc" value="5001"/>
     <jsp:setProperty property="customerName" name="Acc" value="sandhya"/>
      <jsp:setProperty property="balance" name="Acc" value="50000"/>
      <jsp:getProperty property="id" name="Acc"/>
   <jsp:getProperty property="customerName" name="Acc"/>
    <jsp:getProperty property="balance" name="Acc"/>
  
  
</body>
</html>