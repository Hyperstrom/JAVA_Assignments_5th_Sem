/*
 Write a program to use different String methods
 */
import java.util.Scanner;

public class question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        sc.close();
        // string length 
        System.out.println("Length of the string : "+ s.length());
        //convert the string to uppercase 
        System.out.println("Upper case of the String : "+s.toUpperCase()); 
        //String split
        System.out.println("\nSplit Array : ");
        String splitarray[] = s.split(" ");
        for (int i = 0; i < splitarray.length; i++) {
            System.out.println(splitarray[i]);
        }
    }
}
/*
 *OUTPUT
 Enter a string : Hello World
Length of the string : 11
Upper case of the String : HELLO WORLD

Split Array :
Hello
World
 */