/*
 Write a program to implement 2D integer array
 */

import java.util.Scanner;

public class question_03 {
    public static void printarray(int arr[][],int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[20][20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the 2D array : ");
        int n = sc.nextInt();
        System.out.println("Enter the values -- ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter array["+(i+1)+"]["+(j+1)+"] value : ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The 2D array is: ");
        printarray(arr, n);
    }
}
/*
Enter the size of the 2D array : 2
Enter the values -- 
Enter array[1][1] value : 1
Enter array[1][2] value : 2
Enter array[2][1] value : 3
Enter array[2][2] value : 4
The 2D array is:
1 2
3 4
 */