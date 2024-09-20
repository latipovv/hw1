package student;

import java.util.Scanner;

public class Homework1 {

    public double shippingCalculator(int n){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items purchased: ");
        int numItems = scanner.nextInt();

        double shippingCharge;
        if (numItems <= 0) {
            shippingCharge = 0;
        } else if (numItems == 1) {
            shippingCharge = 10.95;
        } else {
            shippingCharge = 10.95 + (numItems - 1) * 2.95;
        }

        System.out.printf("The shipping charge is: $%.2f%n", shippingCharge);

        scanner.close();
        return shippingCharge;
    }
    public boolean isValidTriangle(int a, int b, int c){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first straw: ");
        double length1 = scanner.nextDouble();

        System.out.print("Enter the length of the second straw: ");
        double length2 = scanner.nextDouble();

        System.out.print("Enter the length of the third straw: ");
        double length3 = scanner.nextDouble();

        boolean validTriangle = (length1 + length2 > length3) &&
                (length1 + length3 > length2) &&
                (length2 + length3 > length1);

        if (validTriangle) {
            System.out.println("These lengths can form a triangle.");
        } else {
            System.out.println("These lengths cannot form a triangle.");
        }

        scanner.close();
        return validTriangle;
    }
    public boolean isPrime(int number){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
        return isPrime;
    }

    public  int hex2int(String hex) {
        if (hex.length() != 1) {
            return -1;
        }

        char ch = hex.toUpperCase().charAt(0);

        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            return ch - 'A' + 10;
        } else {
            return -1;
        }
    }
    public String int2hex(int value) {
        if (value < 0 || value > 15) {
            return "-1";
        }

        if (value < 10) {
            return String.valueOf(value);
        } else {
            return String.valueOf((char) ('A' + (value - 10)));
        }
    }


}
