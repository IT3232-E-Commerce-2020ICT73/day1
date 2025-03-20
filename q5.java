import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
       
        reverseHalves(n);
    }

    public static void reverseHalves(int n){
        int mid = n / 2;
        for (int i = mid; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = n; i > mid; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}