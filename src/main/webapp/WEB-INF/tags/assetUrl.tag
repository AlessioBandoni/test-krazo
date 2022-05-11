<%@tag description="Overall Page template" pageEncoding="UTF-8" %>
<%@attribute name="assetPath" required="true" rtexprvalue="true" type="java.lang.String" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:out value="${pageContext.servletContext.contextPath}/assets/${assetPath}" />