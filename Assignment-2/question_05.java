/*
 Write a program to implement 3D integer array
 */

import java.util.Scanner;

public class question_05 {
    public static void printarray(int arr[][][],int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    System.out.print(arr[i][j][j2]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the 3D array : ");
        int n = sc.nextInt();
        int arr[][][] = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    System.out.print("Enter array["+(i+1)+"]["+(j+1)+"]["+(j2+1)+"] value : ");
                    arr[i][j][j2] = sc.nextInt();
                }
            }
        }
        sc.close();
        System.out.println("The 3D array is ");
        printarray(arr, n);
    }
}

/*
 0UTPUT
 Enter size of the 3D array : 2
Enter array[1][1][1] value : 1
Enter array[1][1][2] value : 2
Enter array[1][2][1] value : 3
Enter array[1][2][2] value : 4
Enter array[2][1][1] value : 5
Enter array[2][1][2] value : 6
Enter array[2][2][1] value : 7
Enter array[2][2][2] value : 8
The 3D array is
1 2
3 4

5 6
7 8
 */
