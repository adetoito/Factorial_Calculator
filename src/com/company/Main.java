package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean looping = true;
        int num = 0;
        while (looping) {
            System.out.println("Input a number (less than or equal to 15) to calculate its factorial.");
            try {
                num = sc.nextInt();
                if (num > 16) {
                    System.out.println("Number exceeds limit.");
                } else {
                    looping = false;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Input a number.");
            }
        }
        int factorial = num; int initialNum = num;
        while (num != 0) {
            if (num == 1) {
                break;
            } else {
                factorial *= num - 1;
                num -= 1;
            }
        }
        System.out.println(initialNum + "! = " + factorial);
    }

}
