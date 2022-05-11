<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:base-layout title="Define event">
<jsp:attribute name="main">
<div class="container">
    <form action="" method="post">
        <div class="row">
            <label for="type">Type</label>
            <select name="type" id="type">
                <option>Positive</option>
                <option>Neutral</option>
                <option>Negative</option>
            </select>
        </div>
        <div class="row">
            <label for="category">Category:</label>
            <input id="category" list="available-categories" name="category" value="<c:out value="${event.category}" />">
            <datalist id="available-categories">
                <option value="Chocolate"></option>
                <option value="Coconut"></option>
                <option value="Mint"></option>
            </datalist>
        </div>
        <div class="row">
            <label for="tags">Tags:</label>
            <input id="tags" list="available-tags" name="tags" value="<c:out value="${event.tags}" />">
            <datalist id="available-tags">
                <option value="Chocolate"></option>
                <option value="Coconut"></option>
                <option value="Mint"></option>
            </datalist>
        </div>
        <div class="row">
            <label for="text">Text</label>
            <input class="u-full-width" name="text" type="text" id="text" value="<c:out value="${event.text}" />">
        </div>
        <div class="row">
            <label for="text">Add to date</label>
            <input name="date" type="datetime-local" id="add-date" value="<c:out value="${event.date}" />">
        </div>
        <input class="button-primary" type="submit" value="submit">
    </form>
</div>

</jsp:attribute>
</t:base-layout>
