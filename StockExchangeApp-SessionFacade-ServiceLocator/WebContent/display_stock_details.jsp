<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
 
 <c:choose>
     <c:when test="${!empty  stockDetails }">
         <table border="1" bgcolor='cyan'>
            <tr><th>Info</th><th>Value</th></tr>
            <tr><td>StockId</td><td>${stockDetails.stockId}</td></tr>
            <tr><td>StockName</td><td>${stockDetails.stockName}</td></tr>
            <tr><td>exchangeName</td><td>${stockDetails.exchangeName}</td></tr>
            <tr><td>company Name</td><td>${stockDetails.companyName}</td></tr>
            <tr><td>stockValue</td><td>${stockDetails.stockValue}</td></tr>
            <tr><td>futureValue</td><td>${stockDetails.futureValue}</td></tr>
            <tr><td>baseValue</td><td>${stockDetails.basePrice}</td></tr>
            <tr><td>stockCount</td><td>${stockDetails.stockCount}</td></tr>
            <tr><td>listed Date</td><td>${stockDetails.listedDate}</td></tr>
            <tr><td>variation Rate</td><td>${stockDetails.variationRate}</td></tr>
         </table>
     </c:when>
     <c:otherwise>
         <h1 style="color:red;text-align:center">Stock Details are not found </h1>
     </c:otherwise>
 </c:choose>    
 <br><br>
  <a href="index.html">home</a>
 
    
