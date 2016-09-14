<%@ page isELIgnored="false" %>
<html>
<head>
    <%--<meta name="_csrf" content="${_csrf.token}" />--%>
    <%--<!-- default header name is X-CSRF-TOKEN -->--%>
    <%--<meta name="_csrf_header" content="${_csrf.headerName}" />--%>
</head>
<body>
<h2>Hello World!!!</h2>
<
<form action="/getTest" method="post">
    <%--<input value="${_csrf.token}" />--%>
    <%--<input name="${_csrf.parameterName}" value="${_csrf.token}" />--%>
        <%--<input name="name" value="${name}" />--%>
    <input type="submit">
</form>
</body>
</html>
