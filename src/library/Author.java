/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Crestfall
 */
public class Author {

    public void setAuthorName(String name) {
        authorName = name;
    }

    public void setAuthorEmail(String email) {
        authorEmail = email;
    }

    public void setAuthorGender(char gender) {
        authorGender = gender;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public char getAuthorGender() {
        return authorGender;
    }

    @Override
    public String toString() {
        return authorName + authorEmail + authorGender;
    }
    
    String authorName;
    String authorEmail;
    char authorGender;

    public Author(String name, String email, char gender) {
        authorName = name;
        authorEmail = email;
        authorGender = gender;
    }
}