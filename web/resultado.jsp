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
		Seu IMC � <c:out value="${requestScope.imc}"/> </font></p>    
        <br><br><br>
        <p align="center">Segundo a classifica��o 
        da organiza��o mundial da sa�de voc� est� 
        <font size="18" color="<c:out value="${requestScope.cor}"/> "> <c:out value="${requestScope.classificacao}"/>.</font> </p>    
    </body>
</html>
</code>
</pre>