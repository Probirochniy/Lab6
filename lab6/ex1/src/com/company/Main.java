package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	float num1, num2, result;
    char operator;
    System.out.print("Input first number: ");
    num1 = in.nextInt();
        System.out.print("Input second number: ");
        num2 = in.nextInt();
        System.out.print("Input operator(+,-,*,/): ");
        operator = in.next().charAt(0);
        System.out.print("Result: ");
        if(operator == '+')
        {
            result = num1 + num2;
            System.out.print(result);
        }
        if(operator == '-')
        {
            result = num1 - num2;
            System.out.print(result);
        }
        if(operator == '*')
        {
            result = num1 * num2;
            System.out.print(result);
        }
        if(operator == '/')
        {
            if(num2 != 0 ) {
                result = num1 / num2;
                System.out.print(result);
            }
            else System.out.print("division by 0 is not possible");
        }
    }
}
