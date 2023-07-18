// triangle by for loops
public class num_triangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The triangle is -- ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


// output
// The triangle is -- 
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5