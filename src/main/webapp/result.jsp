 <%@page isELIgnored="false" %>
 
 <% 
//com.ssi.models.TaxModel model=(com.ssi.models.TaxModel)request.getAttribute("info");
 //String author=(String)request.getAttribute("author");
 %>
<html>
<body>
<h3>Tax-Details</h3>
<hr>
<pre>
	Income		${info.income}
	Age		    ${info.age}
	Tax		    ${info.tax}
</pre>
<hr>
<h5>App Created By : ${author}</h5>
</body>
</html>