package com.kodilla.kodillacourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {


    double value1, value2;

    public KodillaCourseApplication (){

        this.value1 = value1;
        this.value2 = value2;

    }
    public double addValue(double value1, double value2){

        double sum = value1 + value2;

        return sum;

    }
    public double substractValue(double value1, double value2){

        double substract = value1 - value2;

        return substract;

    }

    public static void main(String[] args) {
        //SpringApplication.run(KodillaCourseApplication.class, args);

        KodillaCourseApplication equasion = new KodillaCourseApplication();
        System.out.println("Wynik z dodawania: " + equasion.addValue(35.0,52.0));
        System.out.println("Wynik z odejmowania: " + equasion.substractValue(35.0,12.0));
    }



}
