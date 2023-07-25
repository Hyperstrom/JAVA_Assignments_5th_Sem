/*
 Write a program to implement 2D integer array with different number of columns in different rows
 */

import java.util.Scanner;

public class question_04 {
  public static void printarray(int arr[][],int r,int c)
    {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[20][20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns number of the 2D array : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the values -- ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter array["+(i+1)+"]["+(j+1)+"] value : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The 2D array is: ");
        printarray(arr, r,c);
    }  
}

/*
OUTPUT
 Enter the rows and columns number of the 2D array : 2 3
Enter the values --
Enter array[1][1] value : 1
Enter array[1][2] value : 2
Enter array[1][3] value : 3
Enter array[2][1] value : 4
Enter array[2][2] value : 5
Enter array[2][3] value : 6
The 2D array is:
1 2 3
4 5 6
 */