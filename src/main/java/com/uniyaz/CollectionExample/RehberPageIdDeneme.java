package com.uniyaz.CollectionExample;



public class RehberPageIdDeneme {

    private int id ;
    private String name ;
    private String email ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public RehberPageIdDeneme(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RehberPageIdDeneme that = (RehberPageIdDeneme) o;
        return id == that.id;
    }

/*
    public int hashCode() {
        return id;
    }*/

    @Override
    public String toString() {
        return "RehberPageIdDeneme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
