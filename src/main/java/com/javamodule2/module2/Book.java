package com.javamodule2.module2;

public class Book{

    String name;
    int year;

    public Book(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    /*@Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    } */
}
