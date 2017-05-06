<%@page import="java.util.List"%>
<%@page import="com.sv.udb.controlador.UsuarioCtrl"%>
<%@page import="com.sv.udb.modelo.Usuarios"%>
<%@page import="com.sv.udb.controlador.LibroCtrl"%>
<%@page import="com.sv.udb.modelo.Libros"%>
<%@page import="com.sv.udb.modelo.Prestamos"%>
<%@page import="com.sv.udb.controlador.PrestamoCtrl"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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
    <h1>Prestamos</h1>
    <div class="container">
    <form method="POST" action="RealizarPrestamo.jsp" name="Demo">
            <div class="row">
                <div class="input-field col s12 m6">
                    <i class='material-icons prefix'></i>
                    <input id='id' type='text' name='id' value="${id}"/>
                    <label for='id'>Codigo prestamo</label>
                </div>
                <div class="col s12 m6">
                    <select id="codiProv" name="codiLibr" required>                
                    <option value="" disabled selected>Seleccione un Libro</option>
                    <%
                        int indi = 0;
                        for(Libros temp : new LibroCtrl().ver())
                        {
                            
                    %> 
                    <option value="<%=temp.getCddiLibr()%>"><%=temp.getNombLibr()%></option>
                    <%
                        indi++;
                        }
                    %>
                    </select>
                </div>
                    
                 <div class="col s12 m6">
                    <select id="codiProv" name="codiUsua" required>                
                    <option value="" disabled selected>Seleccione un Usuario</option>
                    <%
                        for(Usuarios temp : new UsuarioCtrl().ver())
                        {
                            
                    %> 
                    <option value="<%=temp.getCodiUsua()%>"><%=temp.getNombUsua()%></option>
                    <%
                        }
                    %>
                    </select>
                </div>
                <div class="input-field col s12 m6">
                    <input type="date" class="datepicker">
                </div>
                
            </div>
            <div class='row center-align'>
                <input class='btn waves-effect grey' ${estGuar} type="submit" name="btonPiez" value="Guardar">
                <input class='btn waves-effect blue' ${estModi} type="submit" name="btonPiez" value="Modificar">
            </div>
        </form>
        <form method="POST" action="EquiposServ" name="Tabla">                                                                                  
            <table border="1">
                <tr>
                    <th>Cons</th>
                    <th>Libro</th>
                    <th>Usuario</th>
                    <th>Fecha Prestamos</th>
                    <th>Fecha Devolucion</th>
                </tr>
                <%
                 List<Prestamos> listEqui = new PrestamoCtrl().ver();
                pageContext.setAttribute("listEquiJSTL", listEqui);

                %>    
                 <c:forEach items="${listEquiJSTL}" var="temp">
                <tr>
                    <td><p><input type="radio" name="codiPresRadi" class='with-gap' id="${temp.getCodi()}" value="${temp.getCodi()}"><label for="${temp.getCodi()}"></label></p></td>
                    <td>${temp.getNombLibr()}</td>
                    <td>${temp.getNombUsua()}</td>
                    <td>${temp.getFechaPres()}</td>
                    <td>${temp.getFechaDevo()}</td>
                </tr>
                </c:forEach>

            </table>
            <input type="submit" name="btnEqui" value="Consultar"/>
            <input type="submit" name="btnEqui" value="Eliminar"/>
         </form>
         <script>
        $(document).ready(function(){
            $('.button-collapse').sideNav();
            $('.materialboxed').materialbox();
            $('select').material_select();
            $('.datepicker').pickadate({ });
       
        });
        </script>
            <div>
    </body>
</html>
