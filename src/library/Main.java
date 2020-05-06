/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crestfall
 */
public class Main {

    private static final ArrayList<Author> authorList = new ArrayList();
    private static final ArrayList<Book> bookList = new ArrayList();

    private static final ArrayList<Author> authorsTemp = new ArrayList();

    /**
     * Returns a formatted string consisting of data of Author (i) from
     * authorList.
     *
     * @param i
     */
    public static void selectAuthor(int i) {
        System.out.format("%3d%40s%40s%10c\n", i, authorList.get(i).getAuthorName(), authorList.get(i).getAuthorEmail(), authorList.get(i).getAuthorGender());
    }

    /**
     * Lists all Authors in authorList. Uses selectAuthor to loop through
     * authorList and print it in succession.
     */
    public static void listAuthor() {
        System.out.format("%3s%40s%40s%10s\n", "id", "name", "email", "gender");
        for (int i = 0; i < authorList.size(); i++) {
            selectAuthor(i);
        }
    }

    /**
     * Create a new Author and add it to authorList.
     *
     * @param name
     * @param email
     * @param gender
     */
    public static void addAuthor(String name, String email, char gender) {
        Author auth = new Author(name, email, gender);
        authorList.add(auth);
        System.out.println("Succesfully added:");
        selectAuthor(authorList.size() - 1);
    }

    public static void selectBook(int i) {
        System.out.format("%3d%40s%40s%10.0f%5d\n", i, bookList.get(i).getBookName(), bookList.get(i).getBookAuthorsNames(), bookList.get(i).getBookPrice(), bookList.get(i).getBookQty());
    }
    
    public static void listBook() {
        System.out.format("%3s%40s%40s%10s%5s\n", "id", "name", "author", "price", "qty");
        for (int i = 0; i < bookList.size(); i++) {
            selectBook(i);
        }
    }
    
    public static void addBook(String name, ArrayList authors, int price) {
        Book addbook = new Book(name, authors, price);
        bookList.add(addbook);
        System.out.println("Successfully added:");
        selectBook(bookList.size() - 1);
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        var name = "";
        var email = "";
        var gender = "";
        var id = "";
        int authorsIDtemp;
        var price = "";

        // CMD Bootleg 1.0 by Davey
        // Initial Creation
        Scanner scanner = new Scanner(System.in);
        var command = "help";
        // Commands
        program:
        while (true) {
            subprog:
            switch (command) {
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Refer to 'help' for list of commands.");
                    break;
                case "help":
                    System.out.println("help: List of available commands.");
                    System.out.println("credits: Show credits.");
                    System.out.println("exit: Exit the program.");
                    System.out.println("TestBook: Run debug commands.");
                    System.out.println("auth_list: List all authors.");
                    System.out.println("auth_add: Add an author.");
                    System.out.println("book_list: List all books.");
                    System.out.println("book_add: Add a book.");
                    break;
                case "credits":
                    System.out.println("Basic Book Library");
                    System.out.println("by: Davey");
                    System.out.println("BID: 2301907252");
                    break;
                case "exit":
                    break program;
                case "TestBook":
                    authorsTemp.clear();
                    addAuthor("Davey", "davey_business17@yahoo.com", 'm');
                    addAuthor("Kenrick", "kenrick_lim88@gmail.com", 'm');
                    
                    authorsTemp.add(authorList.get(0));
                    authorsTemp.add(authorList.get(1));
                    
                    addBook("How to write a book", authorsTemp , 15000);
                    break;
                case "auth_list":
                    listAuthor();
                    break;
                case "auth_add":
                    System.out.println("");
                    System.out.println("Insert author name. Type 'cancel' to cancel.");
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    if (name.equalsIgnoreCase("cancel")) {
                        break;
                    }
                    System.out.println("");
                    System.out.println("Insert author email. Type 'cancel' to cancel.");
                    System.out.print("Email: ");
                    email = scanner.nextLine();
                    if (email.equalsIgnoreCase("cancel")) {
                        break;
                    }
                    while (true) {
                        System.out.println("");
                        System.out.println("Insert author gender (m/f). Type 'cancel' to cancel.");
                        System.out.print("Gender: ");
                        gender = scanner.nextLine();
                        if (gender.equalsIgnoreCase("cancel")) {
                            break;
                        }
                        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
                            addAuthor(name, email, Character.toUpperCase(gender.charAt(0)));
                            break;
                        } else {
                            System.out.println("Please enter 'm' or 'f' only!");
                        }
                    }
                    break;
                case "book_list":
                    listBook();
                    break;
                case "book_add":
                    System.out.println("Insert book name. Type 'cancel' to cancel.");
                    System.out.print("Name: ");
                    name = scanner.nextLine();
                    if (name.equalsIgnoreCase("cancel")) {
                        break;
                    }
                    listAuthor();
                    while (true) {
                        System.out.println("");
                        System.out.println("Insert authors to add. Type 'cancel' to cancel. Type 'fin' to finish adding.");
                        System.out.print("ID: ");
                        id = scanner.nextLine();
                        if (id.equalsIgnoreCase("cancel")) {
                            break subprog;
                        }
                        if (id.equalsIgnoreCase("fin")) {
                            break;
                        }
                        try {
                            authorsIDtemp = Integer.parseInt(id);
                            if (authorsIDtemp < 0 || authorsIDtemp >= authorList.size()) {
                                System.out.println("Item doesn't exist!");
                            }
                            authorsTemp.add(authorList.get(authorsIDtemp));
                        } catch (NumberFormatException e) {
                            System.out.println(e);
                        }
                    }
                    while (true) {
                        System.out.println("");
                        System.out.println("Insert book price. Type 'cancel' to cancel.");
                        System.out.print("Price: ");
                        price = scanner.nextLine();
                        if (name.equalsIgnoreCase("cancel")) {
                            break subprog;
                        }
                        try {
                            Integer.parseInt(price);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println(e);
                            System.out.println("Not a number! Please enter a number.");
                        }
                    }
                    addBook(name, authorsTemp, Integer.parseInt(price));
                    break;
            }
            authorsTemp.clear();

            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }
}
