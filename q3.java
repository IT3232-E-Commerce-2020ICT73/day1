//Q3.
//Print the numbers in reverse
//print odd numbers between 1 to 20
//reverse the left and right numbers (-: input-9  --> output 4 3 2 1 5 9 8 7 6 )


import java.util.*;
import java.util.Scanner;

public class q3{
	public static void main(String args[]){
		
		System.out.print("Enter your Number");
		
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		
		
		for(int i=num; i>0; i--){
			System.out.println(i);
		}
		
	}
}