<%@ page session="false" pageEncoding="utf-8"%>s
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:query var="rs" dataSource="jdbc/TestDB">
select num from abc
</sql:query>

<html>
  <head>
    <title>DB Test</title>
  </head>
  <body>

  <h2>Results</h2>



<c:forEach var="row" items="${rs.rows}">
    Foo ${row.num}<br/>
</c:forEach>


한글도 되야 하는데.. 젠장


  </body>
</html>