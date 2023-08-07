/*
 Write a program to implement a class coordinate with a method to display values of member 
variables. Use object reference variable. Compare two coordinates for equality
 */

class coordinate {
    int x;
    int y;
    int z;
    void display(){
        System.out.println("Coordinate is ("+x+" "+y+" "+z+")");
    }
}

public class Question_03 {

    public static void main(String[] args) {
        coordinate my_Coordinates1 = new coordinate();
        my_Coordinates1.x = 30;
        my_Coordinates1.y = 60;
        my_Coordinates1.z = 3;
        my_Coordinates1.display();
        coordinate my_Coordinates2 = new coordinate();
        my_Coordinates2.x = 30;
        my_Coordinates2.y = 60;
        my_Coordinates2.z = 3;
        my_Coordinates2.display();

        if (my_Coordinates1.x == my_Coordinates2.x && my_Coordinates1.y == my_Coordinates2.y && my_Coordinates1.z == my_Coordinates2.z) {
            System.out.println("Coordinates are same");
        }
        else
        {
            System.out.println("Coordinates are not same");
        }
    }
}

/*
OUTPUT 
Coordinate is (30 60 3)
Coordinate is (30 60 3)
Coordinates are same
 */