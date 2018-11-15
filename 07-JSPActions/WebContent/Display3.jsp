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
   
  
  
    <jsp:setProperty property="id" name="Acc" param="txt1"/>
     <jsp:setProperty property="customerName" name="Acc" param="txt2"/>
      <jsp:setProperty property="balance" name="Acc" param="txt3"/>
      <jsp:setProperty property="date1" name="Acc" param="txt4"/>
      
      <jsp:getProperty property="id" name="Acc"/>
   <jsp:getProperty property="customerName" name="Acc"/>
    <jsp:getProperty property="balance" name="Acc"/> 
    <jsp:getProperty property="dob" name="Acc"/> 
    
    
    
</body>
</html>