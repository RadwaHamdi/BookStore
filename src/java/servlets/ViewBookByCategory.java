package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import beanPkg.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author apple
 */
public class ViewBookByCategory extends HttpServlet {

    ServletConfig myServletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        myServletConfig = config;

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        String type = request.getParameter("category");
        List bookList =ConnectDb.viewProductsBycategory(type);
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("category", bookList);
        request.setAttribute("catName", type);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("category1.jsp");
        requestDispatcher.forward(request, response);

        
    }

//    public ResultSet viewProductsBycategory(String type) {
//
//            ResultSet resultSet = null;
//        try {
//            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookStore", "root", "");
//            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from book where type=?");
//            preparedStatement.setString(1, type);
//             resultSet = preparedStatement.executeQuery();
//                
//        } catch (SQLException ex) {
//            Logger.getLogger(ViewBookByCategory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                    return resultSet;
//
//
//    }

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
