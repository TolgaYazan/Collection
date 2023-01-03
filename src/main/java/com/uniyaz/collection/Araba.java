package com.uniyaz.collection;

public class Araba {
    private  int id ;
    private String brand;

    public Araba(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
