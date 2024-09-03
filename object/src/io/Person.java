package io;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String job;
    transient String email;

    public Person(String name, String job, String email) {
        this.name = name;
        this.job = job;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", job=" + job + ", email=" + email + "]";
    }

}
