<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
        href="<c:url value="/recursos/stylesheets/estilo.css"/>" />
    <!-- Inclusão do título pelo Tiles -->
    <title>
        <tiles:getAsString name="titulo" />
    </title>
</head>
<body>
	
	<!-- Inclusão do cabeçalho -->
    <tiles:insertAttribute name="cabecalho"/>
    <!-- Inclusão do conteúdo -->
    <tiles:insertAttribute name="conteudo"/>
    <!-- Inclusão do rodapé -->
    <tiles:insertAttribute name="rodape"/>

</body>
</html>