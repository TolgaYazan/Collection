package com.uniyaz.fileobejectoperations;

import java.io.Serializable;
import java.util.Objects;

public class Rehber implements Serializable {

    private int id;
    private String name;

    private transient String gsm;

    public Rehber(int id, String name, String gsm) {
        this.id = id;
        this.name = name;
        this.gsm = gsm;
    }

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

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    @Override
    public String toString() {
        return "Rehber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gsm='" + gsm + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rehber rehber = (Rehber) o;
        return id == rehber.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
