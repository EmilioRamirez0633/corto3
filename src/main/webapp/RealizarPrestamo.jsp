<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.sv.udb.controlador.PrestamoCtrl"%>
<jsp:useBean id="objeEqui" class="com.sv.udb.modelo.Prestamos"/>
<jsp:setProperty property="*" name="objeEqui"/>
<%
    if(new PrestamoCtrl().guar(objeEqui))
    {
        response.sendRedirect("index.jsp");
    }
    else
    {
        System.err.println("No se guardó");
    }
%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
