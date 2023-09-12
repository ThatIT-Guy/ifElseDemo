package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        when using if else after if you provide the condition in the () and if that condition is not fulfilled then else statement will be executed
//        you cannot provide a condition to else statement
        if (age >= 18) {
            System.out.println("Complementary Drink : Beer for adults");
        } else {
            System.out.println("Complementary drink : coffee for youngsters");
        }
    }
}