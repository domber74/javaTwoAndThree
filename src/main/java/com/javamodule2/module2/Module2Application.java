package com.javamodule2.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Module2Application {

    public static void main(String[] args) {
        //SpringApplication.run(Module2Application.class, args);

        LinkedList<Book> list = new LinkedList<Book>();

        Book bookOne = new Book("Krzyżacy", 1985);
        Book bookTwo = new Book("Hobbit", 2007);
        Book bookThree = new Book("Bajki Robotów", 1977);
        Book bookFour = new Book("Harry Poter", 2005);
        Book bookFive = new Book("Władca Much", 1990);


        list.add(bookOne);
        list.add(bookTwo);
        list.add(bookThree);
        list.add(bookFour);
        list.add(bookFive);

        for (Book books : list) {
            if(books.year < 2000){
                //System.out.println(books.toString());
                System.out.println(books.getName() + " " + books.getYear());
            }

        }

        //System.out.println(list);

        /* ArrayList <Double> infoGrades = new ArrayList<Double>();

        //Double average = 0.0;
        Double sum = 0.0;

        infoGrades.add(5.0);
        infoGrades.add(3.5);
        infoGrades.add(6.0);
        infoGrades.add(4.5);
        infoGrades.add(4.5);

        System.out.println(Collections.max(infoGrades));
        infoGrades.remove(Collections.max(infoGrades));
        System.out.println(Collections.min(infoGrades));
        infoGrades.remove(Collections.min(infoGrades));

        System.out.println(infoGrades);

        for(Double grade : infoGrades) {
            //System.out.println(grade);
            sum += grade;
            System.out.println(sum);
        }
        System.out.println(sum / infoGrades.size()); */

        /*int x =4;
        boolean y = true;
        double z = 3.33;

        Integer X = 4;
        Boolean Y = true;
        Double Z = 3.33;

        if(x == X){
            System.out.println("Equal");
        }
        else
            System.out.println("Not equal"); */

        /*ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(4);
        for (Integer X: intList) {
            System.out.println(X);
        } */

        //Integer X = x;
        //Boolean Y = y;
        //Double Z = z;



        /*double sum =0;
        int numbers[] = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        for(int i = 0; i<numbers.length; i++){
            System.out.println( "Array number: " + i + " = " + numbers[i]);
            sum += numbers[i];
            System.out.println(sum);
        }

        sum /= numbers.length;
        System.out.println(sum); */

    }
}
