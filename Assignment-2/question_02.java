/*
 Write a program to sort an array of integers 
 bubble sort
 */
import java.util.Scanner;
public class question_02 {
    public static void printarray(int arr[],int n)
{
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
}
public static void bubble_sort(int arr[],int n)
{
    int temp;
    for (int i = 0; i < n-1; i++) {
        for ( int j = 0; j < n-1-i; j++) {
            if (arr[j]>arr[j+1]) {
               temp = arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp; 
            }
            
        }
    }
    printarray(arr, n);
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
    System.out.println("Before sorting the array is : ");
    printarray(arr, n);
    System.out.println("\nAfter sorting the array is : ");
    bubble_sort(arr, n);
}  
}

/*
// OUTPUT//
Enter the limit of the array : 5
Enter 1th number : 10
Enter 2th number : 7
Enter 3th number : 11
Enter 4th number : 35
Enter 5th number : 20
Before sorting the array is :
10 7 11 35 20
After sorting the array is :
7 10 11 20 35
 */