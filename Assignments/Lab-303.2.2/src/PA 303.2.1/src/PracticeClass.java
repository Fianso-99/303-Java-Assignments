package com.perscholas.java_basics;

public class PracticeClass {

    public static void main(String[] args) {

        // --- Exercise 1 ---
        int num1 = 10;
        int num2 = 20;
        int sumInt = num1 + num2;
        System.out.println("Ex 1 Sum: " + sumInt);

        // --- Exercise 2 ---
        double d1 = 15.5;
        double d2 = 10.25;
        double sumDouble = d1 + d2;
        System.out.println("Ex 2 Sum: " + sumDouble);

        // --- Exercise 3 ---
        int myInt = 5;
        double myDouble = 7.5;
        double mixedSum = myInt + myDouble;
        System.out.println("Ex 3 Sum (must be double): " + mixedSum);

        // --- Exercise 4 ---
        int smallInt = 5;
        int largeInt = 15;
        int resultInt = largeInt / smallInt;
        System.out.println("Ex 4 Division: " + resultInt);

        // Exercise 5: Double division and casting
        double dNum1 = 25.5;
        double dNum2 = 5.0;
        double divResult = dNum1 / dNum2;
        System.out.println("Ex 5 Division result: " + divResult);

        // Cast the result to an integer
        int castedResult = (int) divResult;
        System.out.println("Ex 5 Casted to integer: " + castedResult);

        // Exercise 6: Integer vs Double division
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.println("Ex 6 Initial q (y/x): " + q);

        q = (double) y; // Now we cast y to double
        System.out.println("Ex 6 q after casting y: " + q);

        // Exercise 7: Named Constant
        final double PI = 3.14159;
        double radius = 10.0;
        double area = PI * (radius * radius);
        System.out.println("Ex 7 Area using constant: " + area);

        // Exercise 8: Cafe Order
        // 1. Declare products and prices
        double coffee = 3.50;
        double cappuccino = 4.75;
        double espresso = 2.50;

        // 2. Declare subtotal and total sale
        double subtotal;
        double totalSale;

        // 3. Complete the "order"
        // 3 coffees, 4 cappuccinos, 2 espressos
        subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);

        // 4. Create a constant for Sales Tax (let's use 8%)
        final double SALES_TAX = 0.08;

        // 5. Calculate total sale including tax
        totalSale = subtotal + (subtotal * SALES_TAX);

        // 6. Print formatted results
        System.out.println("--- Cafe Receipt ---");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Sales Tax: $%.2f%n", (subtotal * SALES_TAX));
        System.out.printf("Total Sale: $%.2f%n", totalSale);



    }
}