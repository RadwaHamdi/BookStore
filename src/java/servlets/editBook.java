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

/**
 *
 * @author amal magdi
 */
public class editBook extends HttpServlet {

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
        ConnectDb con=new ConnectDb();
        response.setContentType("text/html;charset=UTF-8");
         if(request.getParameter("addBook")!=null){
         
              Book b=new Book();
        b.setBookID(Integer.parseInt(request.getParameter("bookID")));
        b.setDescription(request.getParameter("description"));
        b.setAuthor(request.getParameter("author"));
        b.setName(request.getParameter("name"));
        b.setType(request.getParameter("type"));
       b.setQuantity(Integer.parseInt(request.getParameter("quantity")));
       b.setPrice(Double.parseDouble(request.getParameter("price")));
            System.out.println("booooooooook bean  authhhhhhhhhor is "+b.getAuthor());
        //b.setQuantity(10);
        //b.setPrice(20);
        
        
        if(con.addNewBook(b))
             response.sendRedirect("admin.jsp");
        else  response.sendRedirect("add book.jsp");
        
             
             return;
         }
        
        if(request.getParameter("sub")!=null){
         Book b=new Book();
        b.setBookID(Integer.parseInt(request.getParameter("bookID")));
        b.setDescription(request.getParameter("description"));
        b.setAuthor(request.getParameter("author"));
        b.setName(request.getParameter("name"));
        b.setType(request.getParameter("type"));
       b.setQuantity(Integer.parseInt(request.getParameter("quantity")));
       b.setPrice(Double.parseDouble(request.getParameter("price")));
            System.out.println("booooooooook bean  authhhhhhhhhor is "+b.getAuthor());
        //b.setQuantity(10);
        //b.setPrice(20);
        
        
        if(con.editBook(b))
             response.sendRedirect("admin.jsp");
        else  response.sendRedirect("edit product.jsp");
        
        
    }
    
        else if(request.getParameter("rem")!=null){
             if(con.removeBoo(Integer.parseInt(request.getParameter("bookID"))))
             response.sendRedirect("admin.jsp");
             else   response.sendRedirect("edit product.html");
            
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
