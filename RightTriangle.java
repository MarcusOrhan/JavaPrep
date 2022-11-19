package day_10;
//Fatih Tekce ID:261128177
import java.util.Scanner;

public class RightTriangle {

	public static void rightTriangle(int num) {
		for(int i=0;i<num;i++) {
			for(int s=1; s<num-i;s++) {
				System.out.print(" ");
			}
			for(int r=0;r<=i;r++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to print right triangle of stars");
		int num = scan.nextInt();
		if(num<0) 
			System.out.print("Error: input value must be >=0");
		else 
			rightTriangle(num);

	}

}
