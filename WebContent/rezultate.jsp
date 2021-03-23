<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Suma numerelor este:
<c:out value="${sumaNr}"/>
<br>
Nr cel mai mare este:
<c:out value="${max}"/>
<br>
Nr cel mai mic este:
<c:out value="${min}"/>
<br>
Media aritmetica a numerelor este:
<c:out value="${medAr}"/>
<br>
Lista numerelor  ordonate crescator :
<c:out value="${litaOrd}"/>
</body>
</html>