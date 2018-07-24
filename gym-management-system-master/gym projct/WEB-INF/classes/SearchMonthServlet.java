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

public class SearchMonthServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
String mont=request.getParameter("month");
String fee=request.getParameter("fe");       
out.println("<font color='red'><center><h1>Student who Submited Fees in " +mont+ "</h1></center></font>");
          int sum=0,count=0;  
if(mont.equals("january"))
{
            PreparedStatement ps = con.prepareStatement("select ida,name,january from fees,photos where january>0 and fees.ida=photos.id");
            ResultSet rs = ps.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>January</h2></center></td></tr>");
            while ( rs.next()) 
	{
        out.print("<tr><td>" + rs.getInt("ida") + "</td>");	
        out.print("<td>" + rs.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rs.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rs.getInt("january") + "</center></td></tr>");                  
sum=rs.getInt("january")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("february"))
{
            PreparedStatement pa = con.prepareStatement("select ida,name,february from fees,photos where february>0 and fees.ida=photos.id");
            ResultSet ra = pa.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>February</h2></center></td></tr>");
            while ( ra.next()) 
	{
        out.print("<tr><td>" + ra.getInt("ida") + "</td>");	
        out.print("<td>" + ra.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  ra.getString("ida") + "></img> </td>");
	out.print("<td><center>" +ra.getInt("february") + "</center></td></tr>");                  
        sum=ra.getInt("february")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");

}
if(mont.equals("march"))
{
            PreparedStatement pb = con.prepareStatement("select ida,name,march from fees,photos where march>0 and fees.ida=photos.id");
            ResultSet rb = pb.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>March</h2></center></td></tr>");
            while ( rb.next()) 
	{
        out.print("<tr><td>" + rb.getInt("ida") + "</td>");	
        out.print("<td>" + rb.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rb.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rb.getInt("march") + "</center></td></tr>");                  
        sum=rb.getInt("march")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("april"))
{
            PreparedStatement pc = con.prepareStatement("select ida,name,april from fees,photos where april>0 and fees.ida=photos.id");
            ResultSet rc = pc.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>April</h2></center></td></tr>");
            while ( rc.next()) 
	{
        out.print("<tr><td>" + rc.getInt("ida") + "</td>");	
        out.print("<td>" + rc.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rc.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rc.getInt("april") + "</center></td></tr>");                  
        sum=rc.getInt("april")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("may"))
{
            PreparedStatement pd = con.prepareStatement("select ida,name,may from fees,photos where may>0 and fees.ida=photos.id");
            ResultSet rd = pd.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>May</h2></center></td></tr>");
            while ( rd.next()) 
	{
        out.print("<tr><td>" + rd.getInt("ida") + "</td>");	
        out.print("<td>" + rd.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rd.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rd.getInt("may") + "</center></td></tr>");                  
        sum=rd.getInt("may")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
 }
if(mont.equals("june"))
{
            PreparedStatement pe = con.prepareStatement("select ida,name,june from fees,photos where june>0 and fees.ida=photos.id");
            ResultSet re = pe.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>June</h2></center></td></tr>");
            while ( re.next()) 
	{
        out.print("<tr><td>" + re.getInt("ida") + "</td>");	
        out.print("<td>" + re.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  re.getString("ida") + "></img> </td>");
	out.print("<td><center>" +re.getInt("june") + "</center></td></tr>");                  
        sum=re.getInt("june")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("july"))
{
            PreparedStatement pf = con.prepareStatement("select ida,name,july from fees,photos where july>0 and fees.ida=photos.id");
            ResultSet rf = pf.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>July</h2></center></td></tr>");
            while ( rf.next()) 
	{
        out.print("<tr><td>" + rf.getInt("ida") + "</td>");	
        out.print("<td>" + rf.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rf.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rf.getInt("july") + "</center></td></tr>");                  
        sum=rf.getInt("july")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("august"))
{
            PreparedStatement pg = con.prepareStatement("select ida,name,august from fees,photos where august>0 and fees.ida=photos.id");
            ResultSet rg = pg.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>August</h2></center></td></tr>");
            while ( rg.next()) 
	{
        out.print("<tr><td>" + rg.getInt("ida") + "</td>");	
        out.print("<td>" + rg.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rg.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rg.getInt("august") + "</center></td></tr>");                  
        sum=rg.getInt("august")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}
if(mont.equals("september"))
{
            PreparedStatement ph = con.prepareStatement("select ida,name,september from fees,photos where september>0 and fees.ida=photos.id");
            ResultSet rh = ph.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>September</h2></center></td></tr>");
            while ( rh.next()) 
	{
        out.print("<tr><td>" + rh.getInt("ida") + "</td>");	
        out.print("<td>" + rh.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rh.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rh.getInt("september") + "</center></td></tr>");                  
        sum=rh.getInt("september")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
 }
if(mont.equals("october"))
{
            PreparedStatement pi = con.prepareStatement("select ida,name,october from fees,photos where october>0 and fees.ida=photos.id");
            ResultSet ri = pi.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>October</h2></center></td></tr>");
            while ( ri.next()) 
	{
        out.print("<tr><td>" + ri.getInt("ida") + "</td>");	
        out.print("<td>" + ri.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  ri.getString("ida") + "></img> </td>");
	out.print("<td><center>" +ri.getInt("october") + "</center></td></tr>");                  
        sum=ri.getInt("october")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
}        
if(mont.equals("november"))
{
            PreparedStatement pj = con.prepareStatement("select ida,name,november from fees,photos where january>0 and fees.ida=photos.id");
            ResultSet rj = pj.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>November</h2></center></td></tr>");
            while ( rj.next()) 
	{
        out.print("<tr><td>" + rj.getInt("ida") + "</td>");	
        out.print("<td>" + rj.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rj.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rj.getInt("november") + "</center></td></tr>");                  
        sum=rj.getInt("november")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
 }
if(mont.equals("december"))
{
            PreparedStatement pk = con.prepareStatement("select ida,name,december from fees,photos where december>0 and fees.ida=photos.id");
            ResultSet rk = pk.executeQuery();
	    out.println("<table border=3 widht=1150 height=300><tr><td width=105 heigt=50><center><h2>Form no</h2></center></td><td width=105 heigt=50><center><h2>Name</h2></center></td><td width=105 heigt=50><center><h2>Photos</h2></center></td><td width=105 heigt=50><center><h2>december</h2></center></td></tr>");
            while ( rk.next()) 
	{
        out.print("<tr><td>" + rk.getInt("ida") + "</td>");	
        out.print("<td>" + rk.getString("name") + "</td>");
	out.print("<td><img width='150' height='150' src=displayphoto?id=" +  rk.getString("ida") + "></img> </td>");
	out.print("<td><center>" +rk.getInt("december") + "</center></td></tr>");                  
        sum=rk.getInt("december")+sum;  
count=count+1;      
}
out.println("<h2>Total Student:-" +count+ "</h2>");
out.println("<h2>Total Sum:-" +sum+ "</h2>");
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