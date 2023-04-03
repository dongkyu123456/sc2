package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DrivercheckTests {
    
     public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver loaded");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        }
        
    }
}