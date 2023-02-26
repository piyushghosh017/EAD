

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NIRBHAY SINGH
 */
public class Search extends HttpServlet {   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name=request.getParameter("name");
            String val=request.getParameter("val");
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/telephone?useSSL=false","root","1234");
                Statement stmt = conn.createStatement();
                String qry1;
                if(name.equals("name"))
                    qry1="select * from td where NAME like '%"+val+"%'";
                else
                    qry1="select * from td where NUMBER='"+val+"'";
                ResultSet rs=stmt.executeQuery(qry1);
                out.println("<br> Data Retrived from tp.TD is:<br><br>&nbsp&nbsp"+"NAME"+"&nbsp&nbsp|&nbsp&nbsp"+"NUMBER"+"&nbsp&nbsp|&nbsp&nbsp"+"ADDRESS<br>");
                while(rs.next()){
                    out.println("|"+rs.getString(1)+"&nbsp&nbsp&nbsp&nbsp&nbsp|&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp&nbsp&nbsp|&nbsp&nbsp|"+rs.getString(3)+"<br>");
                    
                }
            }catch (Exception e){
                e.printStackTrace();
                out.println("In catch block");
                out.println(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
