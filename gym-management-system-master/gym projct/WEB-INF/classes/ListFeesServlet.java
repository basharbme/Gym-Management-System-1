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

public class ListFeesServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
            PreparedStatement ps = con.prepareStatement("select * from fees,photos where fees.ida=photos.id");
            ResultSet rs = ps.executeQuery();
	    out.println("<html><body background=bg.jpg>");
	    out.println("<font color='red'><center><h1>Fees Submited</h1></center></font>");
            out.println("<table border=3 widht=1150 height=300> <tr> <td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>January</h2></center></td><td width=105 heigt=50><center><h2>February</h2></center></td><td width=105 heigt=50><center><h2>March</h2></center></td><td width=105 heigt=50><center><h2>April</h2></center></td><td width=105 heigt=50><center><h2>May</h2></center></td><td width=105 heigt=50><center><h2>June</h2></center></td><td width=105 heigt=50><center><h2>July</h2></center></td><td width=105 heigt=50><center><h2>August</h2></center></td><td width=105 heigt=50><center><h2>September</h2></center></td><td width=105 heigt=50><center><h2>October</h2></center></td><td width=105 heigt=50><center><h2>November</h2></center></td><td width=105 heigt=50><center><h2>December</h2></center></td></tr>");
            while ( rs.next()) 
	{
        out.print("<tr><td><font color='white'>" + rs.getInt("ida") + "</font></td>");	
        out.print("<td><font color='white'>" + rs.getString("name") + "</font></td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rs.getString("ida") + "></img> </td>");
	out.print("<td><font color='white'><center>" +rs.getInt("january") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("february") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("march") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("april") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("may") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("june") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("july") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("august") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("september") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("october") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("november") + "</center></font></td>");                  
   	out.print("<td><font color='white'><center>" +rs.getInt("december") + "</center></td></font></tr>");                  
   		           
   }
out.println("</table>");
            con.close();
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