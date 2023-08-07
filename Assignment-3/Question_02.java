/*
Write a program to define a class student with name, roll, and marks as member variables 
without any constructor with a method to display values of member variables. Check the 
output of the program

without constractor 
 */
class student{ // these are member valriales
    static String name;
    static int roll;
    static double marks;

    static void display(){
        System.out.println("name -- "+name);
        System.out.println("roll -- "+roll);
        System.out.println("marks -- "+marks);
    }
    public static void main(String[] args)
    {
        name = "Aniket";
        roll =4;
        marks = 9.98;
        display();
    }
}
/*
 OUTPUT
name -- Aniket
roll -- 4
marks -- 9.98
 */


