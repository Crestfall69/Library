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
     * @param args
     */
    public static void main(String[] args) {
        
        // CMD Bootleg 1.0 by Davey
        // Initial Creation
        Scanner scanner = new Scanner(System.in);
        var command = "help";
        // Commands
        while (true) {
            switch (command) {
                default:
                    System.out.println("Unknown command.");
                    System.out.println("Refer to 'help' for list of commands.");
                    break;
                case "help":
                    System.out.println("help: List of available commands.");
                    System.out.println("credits: Show credits.");
                    break;
                case "credits":
                    System.out.println("Basic Book Library");
                    System.out.println("by: Davey");
                    System.out.println("BID: 2301907252");
                    break;
            }
            System.out.print("Command: ");
            command = scanner.nextLine();
        }
    }

}
