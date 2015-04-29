package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import beanPkg.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Radwa
 */
@WebServlet(urlPatterns = {"/Cart"})
public class Cart extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Chart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Chart at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        HttpSession s = request.getSession();
        String userEmail = (String) s.getAttribute("email");
       int no = (int) s.getAttribute("size");
       no++;
       s.setAttribute("size", no);
        double total = (double) (s.getAttribute("totalPrice"));
        double balance = (double)(s.getAttribute("creditBalance"));
        ArrayList<Book> addedBook = ConnectDb.selectBook(Integer.parseInt(request.getParameter("book")));
         cartIem cartItem = new cartIem(addedBook.get(0), 1);
        if ((balance - total) <= addedBook.get(0).getPrice() ){
            request.setAttribute("result", ConnectDb.selectBookByName(cartItem.bookId.getName()));
            request.getRequestDispatcher("details.jsp").forward(request, response);
        }
        else{
            
            ArrayList<cartIem> cartBooks = (ArrayList<cartIem>) s.getAttribute("cartItems");
            cartBooks.add(cartItem);
            s.setAttribute("cartItems", cartBooks);
            ConnectDb.addToCart(userEmail, addedBook.get(0).getBookID(), 1);
            request.setAttribute("result", ConnectDb.selectBookByName(cartItem.bookId.getName()));
            request.getRequestDispatcher("details.jsp").forward(request, response);
        }
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
