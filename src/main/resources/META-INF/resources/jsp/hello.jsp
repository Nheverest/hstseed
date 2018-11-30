<html>
<head>
</head>
<body>
<h1><%= request.getParameter("name") %></h1>
<p>Hello ${model.name}, from META-INF/resources/jsp</p>
<p>Hello ${it.name}, from META-INF/resources/jsp</p>
<p>Hello ${this.name}, from META-INF/resources/jsp</p>
</body>
</html>