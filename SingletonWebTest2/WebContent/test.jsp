<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.nt.singleton.Printer"%>
    
 <%
    Printer p1=Printer.getInstance();
    out.println("p1 hashcode ::"+p1.hashCode()+" from jsp");
    
  %>    
