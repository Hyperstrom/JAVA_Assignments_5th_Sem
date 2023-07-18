public class Do_While_Loop {
    public static void main(String[] args) {
        int i =1;
        int sum =0;
        do {
            sum = sum+i;
            i++;
        } while (i<=10);
        System.out.println("Summation to numbers upto 10 : "+sum);
    }
}
//output
//Summation to numbers upto 10 : 55