<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

    int x=10,y=20;
    out.println(x);
    out.println(y);
    out.println(this.num1);
    out.println(this.num2);
    out.println(this.add(1000,200));
    this.welcomeUser();

%>
<%!
int num1,num2;
int add(int n1,int n2)
{
	return n1+n2;
}

void welcomeUser()
{
	System.out.println("Welcome to this Page");
}


%>
<%=add(5000,6000) %>

</body>
</html>