import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListPhotosServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
            PreparedStatement ps = con.prepareStatement("select * from photos");
            ResultSet rs = ps.executeQuery();
	    out.println("<html><body background=bg.jpg><font color='red'><center><h1>PROFILES</h1></center></font>");
            out.println("<table width=1150 height=300> <tr><td width=105 height=50><center><h2>Form no</h2></center></td><td width=105 height=50><center><h2>Name</h2></center></td><td width=105 height=50><center><h2>Photo</h2></center></td><td width=105 height=50><center><h2>Sex</h2></center></td><td width=105 height=50><center><h2>Father Name</h2></center></td><td width=105 height=50><center><h2>Address</h2></center></td><td width=105 height=50><center><h2>Date of joining</h2></center></td></tr>");
            while ( rs.next()) {
		  out.print("<tr><td><center><font color='cyan'>" + rs.getInt("id") + "</font></center></td>");	
                  out.print("<td><center><font color='cyan'>" + rs.getString("title") + "</center></td>");
		  out.println("<td><img width='150' height='150' src=displayphoto?id=" +  rs.getString("id") + "></img> <p/></td>");
   		  //out.print("<td><center><font color='white'>" +rs.getInt("contact") + "</font></center></td>");         
   		  out.print("<td><center><font color='cyan'>" +rs.getString("sex") + "</font></center></td>");
                  out.print("<td><center><font color='cyan'>" +rs.getString("father") + "</font></center></td>");
                  out.print("<td><center><font color='cyan'>" +rs.getString("address") + "</font></center></td>");
                  out.print("<td><center><font color='cyan'>" +rs.getString("dates") + "</font></center></td></tr>");
                  


}
out.println("</table>");
            con.close();
        }
        catch(Exception ex) {

        }
        finally { 
            out.close();
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}