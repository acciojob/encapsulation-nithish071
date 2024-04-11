package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        // not able to access the private variable using '.' operator
        rwOnly.setName("Nithish");
        String name = rwOnly.getName();
        System.out.println(name);
    }
}