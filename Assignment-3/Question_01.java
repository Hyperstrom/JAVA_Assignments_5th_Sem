/*
 Write a program to implement a class coordinate with a method to display values of member variables. 
 Assign the values of the member variable inside the main method. Use new this time. 
 */

class coordinate {
    int x;
    int y;
    int z;
    void display(){
        System.out.println("Coordinate is ("+x+" "+y+" "+z+")");
    }
}

public class Question_01 {

    public static void main(String[] args) {
        coordinate my_Coordinates = new coordinate();
        my_Coordinates.x = 30;
        my_Coordinates.y = 60;
        my_Coordinates.z = 3;
        my_Coordinates.display();
    }
}
/*
 Output -->
 Coordinate is (30 60 3)
 */