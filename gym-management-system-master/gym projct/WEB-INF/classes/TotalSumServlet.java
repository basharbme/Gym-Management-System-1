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

public class TotalSumServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
String mont=request.getParameter("month");
String fee=request.getParameter("fe");       
out.println("<font color='red'><center><h1>Total Student And Total Fees For Each Month</h1></center></font>");
          int sum=0,count=0;  
	    out.println("<table border=3 widht=1150 height=300><tr><td width=305 heigt=150><center><h2>!(*_*)!</h2></center></td><td width=305 heigt=150><center><h2>Total Student</h2></center></td><td width=305 heigt=150><center><h2>Total Sum of Fees </h2></center></td></tr>");

            PreparedStatement ps = con.prepareStatement("select * from fees where january>0");
            ResultSet rs = ps.executeQuery();
            while ( rs.next()) 
	{
                          sum=rs.getInt("january")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>January</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;

            PreparedStatement pa = con.prepareStatement("select * from fees where february>0");
            ResultSet ra = pa.executeQuery();
            while ( ra.next()) 
	{
                          sum=ra.getInt("february")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>February</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pb = con.prepareStatement("select * from fees where march>0");
            ResultSet rb = pb.executeQuery();
            while ( rb.next()) 
	{
                          sum=rb.getInt("march")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>March</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pc = con.prepareStatement("select * from fees where april>0");
            ResultSet rc = pc.executeQuery();
            while ( rc.next()) 
	{
                          sum=rc.getInt("april")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>April</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pd = con.prepareStatement("select * from fees where may>0");
            ResultSet rd = pd.executeQuery();
            while ( rd.next()) 
	{
                          sum=rd.getInt("may")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>May</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pe = con.prepareStatement("select * from fees where june>0");
            ResultSet re = pe.executeQuery();
            while ( re.next()) 
	{
                          sum=re.getInt("june")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>June</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pf = con.prepareStatement("select * from fees where july>0");
            ResultSet rf= pf.executeQuery();
            while ( rf.next()) 
	{
                          sum=rf.getInt("july")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>July</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pg = con.prepareStatement("select * from fees where august>0");
            ResultSet rg = pg.executeQuery();
            while ( rg.next()) 
	{
                          sum=rg.getInt("august")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>August</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement ph = con.prepareStatement("select * from fees where september>0");
            ResultSet rh = ph.executeQuery();
            while ( rh.next()) 
	{
                          sum=rh.getInt("september")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>September</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pi = con.prepareStatement("select * from fees where october>0");
            ResultSet ri = pi.executeQuery();
            while ( ri.next()) 
	{
                          sum=ri.getInt("october")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>October</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pj = con.prepareStatement("select * from fees where november>0");
            ResultSet rj = pj.executeQuery();
            while ( rj.next()) 
	{
                          sum=rj.getInt("november")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>November</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");
 sum=0;
count=0;
            PreparedStatement pk = con.prepareStatement("select * from fees where december>0");
            ResultSet rk = pk.executeQuery();
            while ( rk.next()) 
	{
                          sum=rk.getInt("december")+sum;  
                          count=count+1;      
}
out.println("<tr><td width=305 heigt=150><center>December</center></td><td width=305 heigt=150><center>" +count+ "</center></td><td width=305 heigt=150><center>" +sum+ "</center></td></tr>");

out.println("</table>");

            con.close();
        }
        catch(Exception ex) {
out.println(ex);

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