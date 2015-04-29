package servlets;


import beanPkg.Book;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amal magdi
 */
public class cartIem implements Serializable{
    
    public Book bookId;
    public int quantity;

    public cartIem(Book b , int q) {
        bookId=b;
        quantity=q;
    }
    
    
}
