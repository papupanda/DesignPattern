<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<c:choose>
   <c:when test="${!empty profileInfo }">
          <b>profile Id :: </b> ${profileInfo.pid }  <br>
         <b>profile name :: </b> ${profileInfo.pname }  <br>
         <b>profile Address :: </b> ${profileInfo.addrs }  <br>
         <b>profile Qualification :: </b> ${profileInfo.qlfy }  <br>
         <b>Mobile number :: </b> ${profileInfo.mobileNo }  <br>
   </c:when>
   <c:otherwise>
        <h1 style="color:red;text-align:center">Profile Not Found </h1>
   </c:otherwise>
</c:choose>
<br><br><br>
<a href="index.html">home</a>    

  
    
    
