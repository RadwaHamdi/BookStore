package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import beanPkg.Book;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.naming.Context;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author ahmedrashad
 */
public class FoundBookDetails extends HttpServlet {
// JDBC driver name and database URL

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/bookstore";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    ConnectDb conn = null;
    Statement stmt = null;
    Book book = new Book ();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet FoundBookDetails</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet FoundBookDetails at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
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
        //processRequest(request, response);
        
       // response.sendRedirect("index.jsp");
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
        //response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();

        //out.println(request.getParameter("booklist"));
        ////// add new book
        if(request.getParameter("add")!=null){
            response.sendRedirect("add book.jsp");
            return;
        }
        
        
        /////end of add new book
        
        
        if (!(request.getParameter("booklist").equals(""))) {
            try {
                //STEP 2: Register JDBC driver
                Class.forName("com.mysql.jdbc.Driver");

                //STEP 3: Open a connection
                System.out.println("Connecting to database...");
                                String selectedBook=request.getParameter("booklist");
                System.out.println(selectedBook);
                conn = new ConnectDb();

                //STEP 4: Execute a query
               stmt = conn.getStatment();
                String sql;
                sql = "SELECT * FROM bookStore.book where name = ' "+request.getParameter("bookitem")+"' ";
               // String selectedBook=request.getParameter("booklist");
              sql = "SELECT * FROM bookStore.book where name = '"+selectedBook+"'";
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("after select");
                //STEP 5: Extract data from result set
                while (rs.next()) {
                    //Retrieve by column name
//                 
                    book.setBookID(rs.getInt(1));
                    book.setName(rs.getString("name"));
                    book.setAuthor(rs.getString("auther"));
                    book.setDescription(rs.getString("description"));
                    book.setPrice(rs.getFloat("price"));
                    book.setQuantity(rs.getInt("quantity"));
                    book.setType(rs.getString("type"));
                    System.out.println("book id is "+book.getBookID());
                    System.out.println("book NAME is "+book.getName());
                    request.getServletContext().setAttribute("selectedBook", book);
        response.sendRedirect("edit product.jsp");

                }
                rs.close();
                stmt.close();
               // conn.close();
//                out.close();

                //STEP 6: Clean-up environment
            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                //Handle errors for Class.forName
                e.printStackTrace();
            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null) {
                        stmt.close();
                    }
                } catch (SQLException se2) {
                }// nothing we can do
           //end try

        }
        
        
        
//        request.setAttribute("Book",book);
//       RequestDispatcher req= request.getRequestDispatcher("/edit product.html");
//      req.include(request, response);
      // request.getServletContext().setAttribute("selectedBook", book);
        //response.sendRedirect("/edit product.jsp");
    }
}
}