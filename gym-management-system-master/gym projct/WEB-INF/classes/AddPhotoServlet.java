import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class AddPhotoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Apache Commons-Fileupload library classes
            DiskFileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload sfu  = new ServletFileUpload(factory);

            if (! ServletFileUpload.isMultipartContent(request)) {
                System.out.println("sorry. No file uploaded");
                return;
            }

            // parse request
            List items = sfu.parseRequest(request);
            FileItem  id = (FileItem) items.get(0);
            String photoid =  id.getString();
            
            FileItem title = (FileItem) items.get(1);
            String   phototitle =  title.getString();
            
	    FileItem sex = (FileItem) items.get(3);
            String   sexa =  sex.getString();
            
 FileItem conq = (FileItem) items.get(4);
            String   cont =  conq.getString();
           
 FileItem fname = (FileItem) items.get(5);
            String   father =  fname.getString();
           
 FileItem addr = (FileItem) items.get(6);
            String   adr =  addr.getString();
         
 FileItem dor = (FileItem) items.get(7);
            String   doj =  dor.getString();
                  

       // get uploaded file
            FileItem file = (FileItem) items.get(2);
	    
                        
            // Connect to Oracle
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "12345");
            con.setAutoCommit(false);

            PreparedStatement ps = con.prepareStatement("insert into photos values(?,?,?,?,?,?,?,?)");
            ps.setString(1, photoid);
            ps.setString(2, phototitle);
            // size must be converted to int otherwise it results in error
            ps.setBinaryStream(3, file.getInputStream(), (int) file.getSize());
            ps.setString(4, sexa);
ps.setString(5, cont);
ps.setString(6, father);
ps.setString(7, adr);
ps.setString(8, doj);
	    	    	    	    	    
ps.executeUpdate();


 FileItem jan = (FileItem) items.get(8);
            String   jana =  jan.getString();
 FileItem feb = (FileItem) items.get(9);
            String   feba =  feb.getString();
 FileItem mar = (FileItem) items.get(10);
            String   mara =  mar.getString();
 FileItem apl = (FileItem) items.get(11);
            String   apla =  apl.getString();
 FileItem may = (FileItem) items.get(12);
            String   maya =  may.getString();
 FileItem jun = (FileItem) items.get(13);
            String   juna =  jun.getString();
 FileItem jul = (FileItem) items.get(14);
            String   jula =  jul.getString();
 FileItem aug = (FileItem) items.get(15);
            String   auga =  aug.getString();
 FileItem set = (FileItem) items.get(16);
            String   seta =  set.getString();
 FileItem oct = (FileItem) items.get(17);
            String   octa =  oct.getString();
 FileItem nov = (FileItem) items.get(18);
            String   nova =  nov.getString();
 FileItem dec = (FileItem) items.get(19);
            String   deca =  dec.getString();


PreparedStatement pst=con.prepareStatement("insert into fees values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
pst.setString(1,photoid);
pst.setString(2,phototitle);
pst.setString(3,jana);
pst.setString(4,feba);
pst.setString(5,mara);
pst.setString(6,apla);
pst.setString(7,maya);
pst.setString(8,juna);
pst.setString(9,jula);
pst.setString(10,auga);
pst.setString(11,seta);
pst.setString(12,octa);
pst.setString(13,nova);
pst.setString(14,deca);

int i=pst.executeUpdate();






            con.commit();
            con.close();
            out.println("Photo Added Successfully. <p> <a href='listphotos'>List Photos </a>");
        }
        catch(Exception ex) {
            out.println( "Error --> " + ex.getMessage());
        }
    } 
}