<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
/**
 * Objetivo	jsp Reglas de Diversificaci�n por valor
 *     
 * @nombre	nokcliente.jsp                                                                                   
 * @version	1.0.0
 * @author	Ricardo Zaragoza Solis
 * @since 	03 de Enero del 2014
 *
*/ 
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.Properties"%>
<html>
<head>
<title>Clientes</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<script type="text/javascript" src="/js/swfobject.js"></script>
</head>
<body onLoad="document.getElementById('v8').focus();">
	<div id="headerGenericoID" align="center" class="headerGenerico">
		<jsp:include page="/jsp/amheadergenerico.jsp"></jsp:include>
	</div>

	<div id="flashcontent" align="center" width="100%" style="padding-left:-0px; z-index:300;" >
			<script language="Javascript">
                                // <![CDATA[
											var so = new FlashObject("/flash/Clientes.swf", "v8", "100%", "85%", "8");
											so.addVariable("lang", "en");
											so.addVariable("enforce", "0");
											so.addParam("movie", "/flash/Clientes.swf");
											so.addParam("quality", "high");
											so.addParam("bgcolor", "#FFFFFF");
											so.addParam("wmode", "transparent");
											so.addParam("align","bottom");
											so.addParam("FlashVars","Clientes");
											so.addParam("allowScriptAccess","Never");
											so.addParam("allowNetworking","All");
											so.write("flashcontent");
											// ]]>
            </script>
	</div>
	<div id="footerGenericoID" align="center" class="footerGenerico">
		<jsp:include page="/jsp/amfootergenerico.jsp"></jsp:include>
	</div>
</body>
</html>


