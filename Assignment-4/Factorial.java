//  Write a program to find out factorial of a number using recursion.

import java.util.Scanner;

public class Factorial {

    static int fact(int num)
    {
        if (num == 0) {
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        System.out.print("Factorial of "+num+" is : "+fact(num));
    }

}

/*
Output 
Enter the number :
5
Factorial of 5is : 120
 */