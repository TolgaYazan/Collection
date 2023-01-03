package com.uniyaz.CollectionExample;

import java.util.ArrayList;
import java.util.Objects;

public class RehberPage {

   private static int idCounter = 0 ;



    private int id ;
    private String name;
    private String email ;


    public RehberPage(String name, String email) {
       this.id=idCounter++;
        this.name = name;
        this.email = email;
    }
     public RehberPage(){

     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RehberPage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RehberPage that = (RehberPage) o;
        return id == that.id;
    }


}
