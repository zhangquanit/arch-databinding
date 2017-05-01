package com.googlesample.databinding.entity;

/**
 * @author 张全
 */

public class User {
    public  String firstName;
    public  String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * 对于dataBinding来说，和下面这种写法是一样的，
     */
//    private final String firstName;
//    private final String lastName;
//
//    public User(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }

}
