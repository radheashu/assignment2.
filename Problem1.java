package assignment2.Assignment2;

import java.util.Scanner;

public class Problem1 {
    public static  void main(String[] args) {
        int num = 5, sum = 0;
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        }

    public static class Problem2 {
        public static void main(String [] args) {
            //write a Program to reverse the integer number eg. Input n=231 reverse is 132
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = scanner.nextInt();//123
            int reverse = 0;
            while (number != 0) {
                int lastDigit = number % 10;
                reverse = reverse * 10 + lastDigit;
                number = number / 10;
            }
            System.out.println(reverse);
        }
             }
}

