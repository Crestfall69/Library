/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;

/**
 *
 * @author Crestfall
 */
public class Book {

    /**
     *
     * @param name
     */
    public void setBookName(String name) {
        bookName = name;
    }

    /**
     *
     * @param authors
     */
    public void setBookAuthors(Author authors) {
        bookAuthors.add(authors);
    }

    /**
     *
     * @param price
     */
    public void setBookPrice(double price) {
        bookPrice = price;
    }

    /**
     *
     * @param qty
     */
    public void setBookQty(int qty) {
        bookQty = qty;
    }

    /**
     *
     * @return
     */
    public String getBookName() {
        return bookName;
    }

    /**
     *
     * @return
     */
    public ArrayList<Author> getBookAuthors() {
        return bookAuthors;
    }

    /**
     *
     * @return
     */
    public double getBookPrice() {
        return bookPrice;
    }

    /**
     *
     * @return
     */
    public int getBookQty() {
        return bookQty;
    }

    /**
     *
     * @return
     */
    public String getBookAuthorsNames() {
        String bookAuthorsNames = "";
        for (int i = 0; i < getBookAuthors().size(); i++) {
            if (i == 0) {
                bookAuthorsNames = bookAuthorsNames + bookAuthors.get(i).getAuthorName();
            } else {
                bookAuthorsNames = bookAuthorsNames + ", " + bookAuthors.get(i).getAuthorName();
            }
        }
        return bookAuthorsNames;
    }

    String bookName;
    ArrayList<Author> bookAuthors;
    double bookPrice;
    int bookQty;

    /**
     *
     * @param name
     * @param authors
     * @param price
     */
    public Book(String name, ArrayList<Author> authors, double price) {
        bookName = name;
        bookAuthors = authors;
        bookPrice = price;
        bookQty = 0;
    }

    /**
     *
     * @param name
     * @param authors
     * @param price
     * @param qty
     */
    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        bookName = name;
        bookAuthors = authors;
        bookPrice = price;
        bookQty = qty;
    }
}
