/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crestfall
 */
public class Main {

    private static final ArrayList<Author> authorList = new ArrayList();

    /**
     *
     * @param i
     */
    public static void selectAuthor(int i) {
        System.out.format("%3d%40s\n", i, authorList.get(i).getAuthorName());
    }

    /**
     *
     */
    public static void listAuthor() {
        System.out.format("%3s%40s\n", "id", "name");
        for (int i = 0; i < authorList.size(); i++) {
            selectAuthor(i);
        }
    }

    /**
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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        // CMD Bootleg 1.0 by Davey
        // Initial Creation
        Scanner scanner = new Scanner(System.in);
        var command = "help";
        // Commands
        program:while (true) {
            switch (command) {
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Refer to 'help' for list of commands.");
                    break;
                case "help":
                    System.out.println("help: List of available commands.");
                    System.out.println("credits: Show credits.");
                    System.out.println("exit: Exit the program.");
                    System.out.println("auth_list: List all authors.");
                    System.out.println("auth_add: Add an author.");
                    break;
                case "credits":
                    System.out.println("Basic Book Library");
                    System.out.println("by: Davey");
                    System.out.println("BID: 2301907252");
                    break;
                case "exit":
                    break program;
                case "auth_list":
                    listAuthor();
                    break;
                case "auth_add":
                    System.out.println("Insert author name. Type 'cancel' to cancel.");
                    System.out.print("Name: ");
                    var name = scanner.nextLine();
                    if (name.equalsIgnoreCase("cancel")) {
                        break;
                    }
                    System.out.println("Insert author email. Type 'cancel' to cancel.");
                    System.out.print("Email: ");
                    var email = scanner.nextLine();
                    if (email.equalsIgnoreCase("cancel")) {
                        break;
                    }
                    while (true) {
                        System.out.println("Insert author gender (m/f). Type 'cancel' to cancel.");
                        System.out.print("Gender: ");
                        var gender = scanner.nextLine();
                        if (gender.equalsIgnoreCase("cancel")) {
                            break;
                        }
                        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
                            addAuthor(name, email, gender.charAt(0));
                            break;
                        }
                    }
                    break;
            }
            System.out.println("");
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }

}
