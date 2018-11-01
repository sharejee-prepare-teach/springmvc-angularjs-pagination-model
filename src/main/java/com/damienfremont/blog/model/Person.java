package com.damienfremont.blog.model;

import java.io.Serializable;

/**
 * Created by DELL on 11/1/2018.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 9167120287441116359L;
    public Integer id;
    public String firstName;
    public String lastName;

    public Person() {

    }

    public Person(Integer id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
