package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Radwa
 */
@WebServlet(urlPatterns = {"/Search"})
public class Search extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*HttpServletConfig sConf;
     public void init (HttpServletConfig config) throws ServletException {
     sConf = config;
     }*/
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            java.io.IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Connection cn;
        String productName = request.getParameter("booksearch");

        
            //DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//            DriverManager.registerDriver(new Driver());
//            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
//            PreparedStatement searchStmt = cn.prepareStatement("select * from book where name like ? or auther like ? or type like ?");
//           PreparedStatement searchStmt = cn.prepareStatement("select * from book ");
//            System.out.println("no prob");
//            searchStmt.setString(1, "%" + productName + "%");
//            searchStmt.setString(2, "%" + productName + "%");
//            searchStmt.setString(3, "%" + productName + "%");
//            ResultSet rs = searchStmt.executeQuery();
//            ArrayList<beanpkg.Book> searchedBooks = new ArrayList<>();
//            beanpkg.Book temp;
//            System.out.println("another check");
//            while (rs.next()) {
//                temp = new beanpkg.Book();
//                temp.setBookID(rs.getInt("id"));
//                temp.setName(rs.getString("name"));
//                System.out.println(temp.getName());
//                temp.setAuthor(rs.getString("auther"));
//                temp.setDescription(rs.getString("description"));
//                temp.setType(rs.getString("type"));
//                temp.setPrice(rs.getDouble("price"));
//                temp.setQuantity(rs.getInt("quantity"));
//                searchedBooks.add(temp);
//                System.out.println("after add in array list");
//            }
            System.out.println("after while");
          
            request.setAttribute("results", ConnectDb.selectBookByName(productName));
            request.getRequestDispatcher("searchResult.jsp").forward(request, response);
          //  response.sendRedirect("register.html");

       
             
            
//            getServletContext().getRequestDispatcher("searchResult.jsp").forward(request, response);
        
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        
    }

    @Override
    public String getServletInfo() {
        return null;
    }
    /*public ServletConfig getServletConfig()
     {
     return null;
     }*/
}
