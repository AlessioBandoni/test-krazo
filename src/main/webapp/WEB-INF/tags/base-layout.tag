<%@tag description="Overall Page template" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="main" fragment="true" %>
<%@attribute name="title" rtexprvalue="true" type="java.lang.String" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><c:out value="${title}" /></title>
    <link rel="stylesheet" href="<t:assetUrl assetPath="css/normalize.css" />">
    <link rel="stylesheet" href="<t:assetUrl assetPath="css/style.css" />">
    <link rel="stylesheet" href="<t:assetUrl assetPath="css/skeleton.css" />">
</head>
<body>
<nav>
    <div class="container">
        <div class="row"><a href="event-catalog.html">
            <button><img src="<t:assetUrl assetPath="icons/ti/list.svg" />"></button>
        </a><a href="event-calendar.html">
            <button><img src="<t:assetUrl assetPath="icons/ti/calendar.svg" />"></button>
        </a><a href="define-event.html">
            <button><img src="<t:assetUrl assetPath="icons/ti/plus.svg" />"></button>
        </a></div>
    </div>
</nav>
<main>
<jsp:invoke fragment="main" />
</main>
</body>
</html>