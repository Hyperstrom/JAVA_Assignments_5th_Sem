// Write a program to implement 1D interger array 
import java.util.Scanner;

public class question_01 {
public static void printarray(int arr[],int n)
{
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}
public static void main(String[] args) {
    int arr[] = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the limit of the array : ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.print("Enter "+(i+1)+"th number : ");
        arr[i] = sc.nextInt();
    }
    sc.close();
    System.out.println("The array is : ");
    printarray(arr, n);
}  
}

//output
// Enter the limit of the array : 5
// Enter 1th number : 12
// Enter 2th number : 11
// Enter 3th number : 90
// Enter 4th number : 32
// Enter 5th number : 16
// The array is :
// 12 11 90 32 16