 /*
 Work with default and public member variables of a class. Set values and display values from main() 
  */
class class_1 {
    public int num_1;
    int num_2;
    class_1(int a,int b)
    {
        num_1 = a;
        num_2 = b;
    }
    public static void main(String[] args) {
        class_1 ob = new class_1(80,90);
        System.out.println(ob.num_1);
        System.out.println(ob.num_2);
    }
}
