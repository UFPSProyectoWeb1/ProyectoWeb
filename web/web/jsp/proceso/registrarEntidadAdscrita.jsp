<%-- 
    Document   : registrarEntidadAdscrita
    Created on : 13-dic-2016, 13:22:51
    Author     : Manuel Florez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="co.edu.ufps.controlador.Controlador" id="controlador" scope="session"></jsp:useBean>
<jsp:useBean class="co.edu.ufps.dto.EmpresaAdscrita" id="ads"></jsp:useBean>
<jsp:setProperty property="*" name="ads"/>
<%
    out.print(ads.getEmail()+" ---- "+ads.getNombre_empresa());
%>


