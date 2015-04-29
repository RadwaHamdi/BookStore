package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import beanPkg.Book;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Karim
 */
public class ConnectDb {

    private final String schemaName = "jdbc:mysql://localhost:3306/bookstore";
    private final String username = "root";
    private final String password = "root";
    private userBean user = null;

    public String getSchemaName() {
        return schemaName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
     java.sql.Connection con;
    public Statement getStatment() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // Class.forName("com.mysql.jdbc.Driver");
            // Connection con=  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/jets" , "root" ,"1234");
           con = DriverManager.getConnection(getSchemaName(), getUsername(), getPassword());

            Statement stmt = (Statement) con.createStatement();
            return stmt;
        } catch (SQLException ex) {
            System.out.println("erooooooooooooooooooor  in db");
            return null;
        }
    }

   public userBean signIn(String email, String password) {
        user = null;
        try {
          
            Statement stmt = getStatment();
            ResultSet rs = stmt.executeQuery(" SELECT * FROM user where email = '" + email + "' and password ='" + password + "'");
            if (rs.next()) {
                user = new userBean();
                user.setEmail(rs.getString(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setJob(rs.getString(5));
                user.setBirthday(rs.getString(6));
                user.setAddress(rs.getString(7));
                user.setCreditBalance(rs.getInt(8));

            }

        } catch (Exception ee) {
            System.out.println("errrrrrrrrrrrrrrrrrror in db sign in ");

        }
        return user;
    }
    public userBean getUser() {
        return user;
    }

       public boolean signUp(userBean user) {
        String email = user.getEmail();
        String first = user.getFirstname();
        String last = user.getLastname();

        String pass = user.getPassword();
        String job = user.getJab();
        String birthDay = user.getBirthday();
        String address = user.getAddress();
        double credit = user.getCreditBalance();

    

            try {
               // ConnectDb con = new ConnectDb();
                Statement stmt = getStatment();
                stmt.executeUpdate(" insert into user(email ,firstName ,lastName ,password,job ,birthday ,address ,creditBalance ) values ('" + email + "' ,'" + first + "','" + last + "' ,'" + pass + "' ,'" + job + "' ,'" + birthDay + "' ,'" + address + "' ," + credit + ")");
                return true;
            } catch (Exception e) {
                System.out.println("insert errrrrrrrrrrrror");
                return false;
            }
        }
///////// end ofsign up method
    
    
    
    
    public static ArrayList<Book> selectBookByName(String keyWord) {
        ArrayList<Book> searchedBooks = null ;
        try {
            DriverManager.registerDriver(new Driver());
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            PreparedStatement searchStmt = cn.prepareStatement("select * from book where name like ? or auther like ? or type like ?");
            searchStmt.setString(1, keyWord + "%");
            searchStmt.setString(2,  keyWord + "%");
            searchStmt.setString(3, keyWord + "%");
            ResultSet rs = searchStmt.executeQuery();
            Book temp;
            searchedBooks = new ArrayList<>();
            while (rs.next()) {
                temp = new Book();
                temp.setBookID(rs.getInt("id"));
                temp.setName(rs.getString("name"));
                System.out.println(temp.getName());
                temp.setAuthor(rs.getString("auther"));
                temp.setDescription(rs.getString("description"));
                temp.setType(rs.getString("type"));
                temp.setPrice(rs.getDouble("price"));
                temp.setQuantity(rs.getInt("quantity"));
                searchedBooks.add(temp);
            }
            cn.close();
        } catch (SQLException ex) {
            searchedBooks = null;
           // Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  searchedBooks;
        

    }
    public static ArrayList<Book> selectBook(int bookID){
        Book temp = null;
        ArrayList<Book> searchedBook;
         try {
            DriverManager.registerDriver(new Driver());
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            PreparedStatement searchStmt = cn.prepareStatement("select * from book where id = ?");
            searchStmt.setInt(1, bookID);
           
            ResultSet rs = searchStmt.executeQuery();
           searchedBook = new ArrayList<>();
             
            while (rs.next()) {
                temp = new Book();
                temp.setBookID(rs.getInt("id"));
                temp.setName(rs.getString("name"));
                System.out.println(temp.getName());
                temp.setAuthor(rs.getString("auther"));
                temp.setDescription(rs.getString("description"));
                temp.setType(rs.getString("type"));
                temp.setPrice(rs.getDouble("price"));
                temp.setQuantity(rs.getInt("quantity"));
               searchedBook.add(temp);
            }
            cn.close();
        } catch (SQLException ex) {
            temp = null;
            searchedBook = null;
           // Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  searchedBook;
    }
    public boolean updateAccount(userBean user) {
         String email = user.getEmail();
        String first = user.getFirstname();
        String last = user.getLastname();

        String pass = user.getPassword();
        String job = user.getJab();
        String birthDay = user.getBirthday();
        String address = user.getAddress();
        double credit = user.getCreditBalance();
            try {
               // ConnectDb con = new ConnectDb();
                Statement stmt = getStatment();
                stmt.executeUpdate("update bookstore.user set firstName='"+first+"', lastName='"+last+"', password='"+pass+"', job='"+job+"', birthday='"+birthDay+"', address='"+address+"', creditBalance='"+credit+"' where email='"+email+"';");
                con.close();
                return true;
            } catch (Exception e) {
            
                 System.out.println("Error in method updateAccount");
                 
                 return false;
            
            }
        }
     public static List viewProductsBycategory(String type) {

        ResultSet resultSet = null;
        List bookList = new ArrayList();

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from book where type=?");
            preparedStatement.setString(1, type);
            resultSet = preparedStatement.executeQuery();
           while (resultSet.next()) {
                Book book = new Book();
                String bookName = resultSet.getString("name");
                String bookAuther = resultSet.getString("auther");
                double bookPrice = resultSet.getDouble("price");
                int bookId=resultSet.getInt("id");
                book.setName(bookName);
                book.setAuthor(bookAuther);
                book.setPrice(bookPrice);
                book.setBookID(bookId);
                //add books to the list
                bookList.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;

    }

    public static List viewAllBooks() {

        ResultSet resultSet = null;
        List bookList = new ArrayList();

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from book");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Book book = new Book();
                String bookName = resultSet.getString("name");
                book.setName(bookName);
                //add books to the list
                bookList.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;

    }

    public static List addCartItemsToList(String _userEmail) {
        List bookList = new ArrayList();
      

        try {
            // String userEmail = request.getParameter("useremail");
          //  String userEmail = "a";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from user_buy_book where email=?");
            preparedStatement.setString(1, _userEmail);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
//                int bookId = resultSet.getInt("bookId");
//                System.out.println(bookId);
//                int quantity = resultSet.getInt("quantity");
                //changeQuantityInBookTable(bookId, quantity);

                Book book = new Book();
                int bookId = resultSet.getInt("bookId");
                int quantity = resultSet.getInt("quantity");
                book.setBookID(bookId);
                book.setQuantity(quantity);
                //add books to the list
                bookList.add(book);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;
    }

    public static double changeQuantityInBookTable(int bookId, int quantity,double totalPrice) {
        try {

            System.out.println("" + bookId + " its qantity" + quantity);
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from book where id=?");
            preparedStatement.setInt(1, bookId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int bookQuantity = resultSet.getInt("quantity");
                System.out.println("bookQuantity " + bookQuantity);
                double bookPrice = resultSet.getDouble("price");
                System.out.println("bookQuantity " + bookQuantity);
                int newQuantity = bookQuantity - quantity;
                System.out.println("bookPrice" + bookPrice);
                java.sql.PreparedStatement updatepreparedStatement = sqlConnection.prepareStatement("UPDATE book SET quantity=? WHERE id=? ");
                updatepreparedStatement.setInt(1, newQuantity);
                updatepreparedStatement.setInt(2, bookId);
                int i = updatepreparedStatement.executeUpdate();
                totalPrice = totalPrice + (bookPrice * quantity);
                System.out.println("" + totalPrice);
            }

            System.out.println("the final price" + totalPrice);

        } catch (SQLException ex) {
            Logger.getLogger(UserBuyBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalPrice;
    }
    
    public static void changeUserBalance(double _totalPrice, String _userEmail){
        try {

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from user where email=?");
            preparedStatement.setString(1,_userEmail);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {              
                double creditBalance = resultSet.getDouble("creditBalance");
                System.out.println("user balance"+creditBalance);
                double newcreditBalance = creditBalance - _totalPrice;
                                System.out.println("newcreditBalance"+newcreditBalance);
                java.sql.PreparedStatement updatepreparedStatement = sqlConnection.prepareStatement("UPDATE user SET creditBalance = ? WHERE email = ? ");
                updatepreparedStatement.setDouble(1, newcreditBalance);
                updatepreparedStatement.setString(2, _userEmail);
                int i = updatepreparedStatement.executeUpdate();
               
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserBuyBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteUserCartAfterBuying(String userEmail){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            
           
            java.sql.PreparedStatement updatepreparedStatement = sqlConnection.prepareStatement("DELETE FROM user_buy_book WHERE email = ? ");
            updatepreparedStatement.setString(1, userEmail);
            int i = updatepreparedStatement.executeUpdate();
            System.out.println(""+i);
           
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   public static int addToCart(String userEmail,int bookId,int quantity){
       int ret =0;
        try {
            DriverManager.registerDriver(new Driver());
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            Statement stmt = cn.createStatement();
            stmt.executeUpdate("insert into user_buy_book(email ,bookId ,quantity ) values ('" + userEmail + "' ," + bookId + "," + quantity + ")");
            cn.close();
        } catch (SQLException ex) {
            ret = 1;
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
        }
           return ret;
   }
  ///admiiiiiiiiiiiiiiin 
    public boolean addNewBook(Book b) {
        int bookid=b.getBookID();
       int quantity=b.getQuantity();
        double price=b.getPrice();
        String name=b.getName();
        String desc=b.getDescription();
        String type=b.getType();
        String author=b.getAuthor();
       
            try {
               // ConnectDb con = new ConnectDb();
                Statement stmt = getStatment();
                
               
              stmt.executeUpdate(" insert into book values (" + bookid + " ,'" + name + "','" + author + "' ,'" + desc + "' ,'" + type + "' ," + price + " ," + quantity +  ", 'no' )");
             
              stmt.getConnection().close();

              return true;
            } catch (Exception e) {
                
                System.out.println("insert book errrrrrrrrrrrror");
                e.printStackTrace();
                return false;
            }
        }
    
    public boolean removeBoo(int bookId){
             Statement stmt = getStatment();
        try {
            stmt.executeUpdate("delete from book where id="+bookId);
                            stmt.getConnection().close();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDb.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    
    public boolean editBook(Book b) {
         int bookid=b.getBookID();
         
       boolean isRemoved=  removeBoo(bookid);
       boolean isAdded=addNewBook(b);
       return (isRemoved&&isAdded);
    }
    
        public static List viewRandomBooks() {

        ResultSet resultSet = null;
        List bookList = new ArrayList();

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection sqlConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "root");
            java.sql.PreparedStatement preparedStatement = sqlConnection.prepareStatement("select * from book ORDER BY RAND()  LIMIT 4");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Book book = new Book();
                String bookName = resultSet.getString("name");
                book.setName(bookName);
                String bookauther = resultSet.getString("auther");
                book.setAuthor(bookauther);
                String description = resultSet.getString("description");
                book.setDescription(description);
                //add books to the list
                int id = resultSet.getInt("id");
                book.setBookID(id);
                bookList.add(book);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ViewBookByCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookList;

    }
}

