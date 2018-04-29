<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form class="form-inline" action="" method="get">
            <table>
                <tr>
                    <td><h1 style="font-family:cursive">From:</h1></td>
                    <td><input type="text" class="form-control" id="from" placeholder="Enter Source" name="source"></td>
                </tr>
                <tr>
                    <td><h1>Destination:</h1></td>
                    <td><input type="text" class="form-control" id="destination" placeholder="Enter Destination" name="destination"></td>
                </tr>      
                <tr>
                    <td><h1>Transport:</h1></td>
                    <td><input type="text" class="form-control" id="destination" placeholder="Enter Destination" name="transport"></td>
                </tr>
                <tr><td><button type="submit" class="btn btn-default">Submit</button></td></tr>
    
 </table>
    </form>
</div>
</html>

    <%
      String src=request.getParameter("source");
      String dst=request.getParameter("destination");
      String transport=request.getParameter("transport");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myt","root","1234");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from travel where source='"+src+"' and destination='"+dst+"' and transport='"+transport+"'");
   // out.print(rs);
   
    %><table border="1"><%
                while(rs.next())
                {%>
                <table>
                    <tr>
                        
                        <td><h2><% out.print("Cost = Rs "+rs.getString(4)); %> </h2></td>
                    </tr>
                </table> 
                <%} %>
    </body>
</html>
