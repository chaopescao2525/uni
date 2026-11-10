package de.uniwue.gdp.hello;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[]args){
        System.out.println("Name: ");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
