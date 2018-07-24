import java.lang.*;
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
import java.sql.*;
import javax.servlet.*;

public class SubmitFeesServlet extends HttpServlet {
   
protected void doPost(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
      try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
String idq=request.getParameter("idp");
String mont=request.getParameter("month");
String fee=request.getParameter("fe");       
if(mont.equals("january"))
{
PreparedStatement ps = con.prepareStatement("update fees set january=? where ida=?");
ps.setString(1,fee);
         ps.setString(2,idq);
ps.executeUpdate();
}
if(mont.equals("february"))
{

PreparedStatement pa = con.prepareStatement("update fees set february=? where ida=?");
pa.setString(1,fee);
         pa.setString(2,idq);
pa.executeUpdate();
        
}
if(mont.equals("march"))
{
PreparedStatement pb = con.prepareStatement("update fees set march=? where ida=?");
pb.setString(1,fee);
         pb.setString(2,idq);
pb.executeUpdate();
}
if(mont.equals("april"))
{
PreparedStatement pc = con.prepareStatement("update fees set april=? where ida=?");
pc.setString(1,fee);
         pc.setString(2,idq);
pc.executeUpdate();
}
if(mont.equals("may"))
{
PreparedStatement pd = con.prepareStatement("update fees set may=? where ida=?");
pd.setString(1,fee);
         pd.setString(2,idq);
pd.executeUpdate();
 }
if(mont.equals("june"))
{
PreparedStatement pe = con.prepareStatement("update fees set june=? where ida=?");
pe.setString(1,fee);
         pe.setString(2,idq);
pe.executeUpdate();
}
if(mont.equals("july"))
{
PreparedStatement pf = con.prepareStatement("update fees set july=? where ida=?");
pf.setString(1,fee);
         pf.setString(2,idq);
pf.executeUpdate();
}
if(mont.equals("august"))
{
PreparedStatement pg = con.prepareStatement("update fees set august=? where ida=?");
pg.setString(1,fee);
         pg.setString(2,idq);
pg.executeUpdate();
}
if(mont.equals("september"))
{
PreparedStatement ph = con.prepareStatement("update fees set september=? where ida=?");
ph.setString(1,fee);
         ph.setString(2,idq);
ph.executeUpdate();
 }
if(mont.equals("october"))
{
PreparedStatement pi = con.prepareStatement("update fees set october=? where ida=?");
pi.setString(1,fee);
         pi.setString(2,idq);
pi.executeUpdate();
}        
if(mont.equals("november"))
{
PreparedStatement pj = con.prepareStatement("update fees set november=? where ida=?");
pj.setString(1,fee);
         pj.setString(2,idq);
pj.executeUpdate();
 }
if(mont.equals("december"))
{
PreparedStatement pk = con.prepareStatement("update fees set november=? where ida=?");
pk = con.prepareStatement("update fees set december=? where ida=?");
pk.setString(1,fee);
         pk.setString(2,idq);
pk.executeUpdate();

}

            
               
         con.close();

    out.println("Your Fees Added Successfully. <a href='index.html'>GO TO HOME PAGE</a>");
        
       }
       catch(Exception ex) {
	out.println(ex);

        }
        finally { 
            out.close();
        }
    } 

}