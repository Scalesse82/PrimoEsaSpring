<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
la frase � lunga : ${LunghezzaFrase} <br>

il numero di parole palindrome � : ${lista.size()} <br>

le parole palindrome sono : <br> 

   <c:forEach items="${lista}" var="item">
    ${item}<br>
  </c:forEach>
      


</body>
</html>