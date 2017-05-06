<%-- 
    Document   : catalogo
    Created on : 06-may-2017, 10:40:57
    Author     : Estudiante
--%>

<%@page import="com.sv.udb.controlador.LibroCtrl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel='stylesheet' href='webjars/materialize/0.97.3/dist/css/materialize.min.css'>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
            <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
            <script type="text/javascript" src="webjars/materialize/0.97.3/dist/js/materialize.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <nav>
        <div class="nav-wrapper">
          <a href="#" class="brand-logo">Logo</a>
          <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a href="index.jsp">Prestamos</a></li>
            <li><a href="catalogo.jsp">Catalogo</a></li>
          </ul>
        </div>
      </nav>
        <h1>Catalogo</h1>
        <% request.setAttribute( "test", new LibroCtrl().ver()); %>
    
    <display:table name="test" id="test" pagesize="5">
            <display:column property="cddiLibr" title="ID" sortable="true" sortName="cddiLibr"/>
            <display:column property="nombLibr" title="Nombre libro" sortable="true" sortName="nombLibr"/>
            <display:column property="autoLibr" title="Nombre autor" sortable="true" sortName="autoLibr"/>
            <display:column property="geneLibr" title="Genero" sortable="true" sortName="geneLibr"/>
            <display:column property="anioLibr" title="Año lanzamiento" sortable="true" sortName="anioLibr"/>
            <display:column property="estaLibr" title="Estado" sortable="true" sortName="estaLibr"/>
    </display:table>
    </body>
</html>
