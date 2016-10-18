<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<pre>
  <code class="java">
<html>
    <head>
        <title>Academia Boa Forma</title>
    </head>
    <body>
        <br><br><br>
        <p align="center"><font size="18" color="blue"> 
		Academia Boa Forma </font></p>
        <br><br><br>
        <p align="center"><font size="18" color="blue"> 
		Seu IMC é <c:out value="${requestScope.imc}"/> </font></p>    
        <br><br><br>
        <p align="center">Segundo a classificação 
        da organização mundial da saúde você está 
        <font size="18" color="<c:out value="${requestScope.cor}"/> "> <c:out value="${requestScope.classificacao}"/>.</font> </p>    
    </body>
</html>
</code>
</pre>