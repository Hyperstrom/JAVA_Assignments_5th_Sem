/*
 Write a program to sort Sring Array
 */


import java.util.Arrays;

public class question_07 {
    public static void Printarray(String strarr[])
    {
        for (int i = 0; i < strarr.length; i++) {
            System.out.print(strarr[i]+" ");
        }
    }
  public static void main(String[] args) {
    String strarr[] = {"dog","cat","ant","hello","world","college"};
    System.out.println("Before sorting the string array is : ");
    Printarray(strarr);
    Arrays.sort(strarr);
    System.out.println("\n\nAfter sorting the string array is : ");
    Printarray(strarr);
  }  
}
/*
OUTPUT
 Before sorting the string array is : 
dog cat ant hello world college

After sorting the string array is :
ant cat college dog hello world
 */