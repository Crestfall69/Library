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

    /**
     *
     * @param name
     */
    public void setAuthorName(String name) {
        authorName = name;
    }

    /**
     *
     * @param email
     */
    public void setAuthorEmail(String email) {
        authorEmail = email;
    }

    /**
     *
     * @param gender
     */
    public void setAuthorGender(char gender) {
        authorGender = gender;
    }

    /**
     *
     * @return
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     *
     * @return
     */
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     *
     * @return
     */
    public char getAuthorGender() {
        return authorGender;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return authorName + authorEmail + authorGender;
    }
    
    String authorName;
    String authorEmail;
    char authorGender;

    /**
     *
     * @param name
     * @param email
     * @param gender
     */
    public Author(String name, String email, char gender) {
        authorName = name;
        authorEmail = email;
        authorGender = gender;
    }
}