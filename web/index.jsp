<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
    <script>
        var xmlhttp = new XMLHttpRequest();
        xmlhttp.open("GET", "http://localhost:8080/test/hello");
        xmlhttp.onreadystatechange = function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
            }
        }
        xmlhttp.send(null);
    </script>
    <div align="center" id="myDiv">hello from html</div>
  </body>
</html>